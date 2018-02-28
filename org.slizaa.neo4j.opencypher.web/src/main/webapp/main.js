const baseUrl = window.location.pathname

require.config({
    baseUrl: baseUrl,
    paths: {
        "jquery": "webjars/jquery/3.3.1/jquery.min",
        "ace/ext/language_tools": "webjars/ace/1.2.2/src/ext-language_tools",
        "xtext/xtext-ace": "xtext/2.13.0/xtext-ace",
        "bootstrap": "webjars/bootstrap/4.0.0/webjars-requirejs.js"
    }
})

require(["webjars/ace/1.2.2/src/ace"], () => {
    require(["xtext/xtext-ace"], (xtext) => {
        const xtextId = new Date().getTime() + ".cypher"
        let editor = xtext.createEditor({
            resourceId: xtextId,
            baseUrl: baseUrl,
            syntaxDefinition: "xtext-resources/generated/mode-cypher",
            theme: "ace/theme/dawn"
        })

        startup(editor)
    })
})

// ----------------------------------------------------------------------------

function setStatus(message) {
    const statusElement = document.getElementById('status-display-text')
    statusElement.innerText = message
}

function renderDelta(keys, delta) {
    let records = []
    const recordsBody = document.getElementById('records-body')
    
    records = Array.from(recordsBody.getElementsByClassName("record"))
    records.forEach(r => {
        if (r.dataset.status === "NEW") {
            r.dataset.status = "ESTABLISHED"
            r.classList.remove('status-new')
            r.classList.add('status-established')
        }
    })

    records = Array.from(recordsBody.getElementsByClassName("record"))
    delta.positive.forEach(p => {
        const tr = document.createElement('tr')
        keys.forEach(key => {
            const td = document.createElement('td')
            td.innerText = p[key]
            tr.appendChild(td)
        })

        tr.classList.add('record')
        tr.classList.add('status-new')

        tr.dataset.data = JSON.stringify(p)
        tr.dataset.status = "NEW",

        recordsBody.insertBefore(tr, recordsBody.firstChild)
    })

    records = Array.from(recordsBody.getElementsByClassName("record"))
    delta.negative.forEach(n => {
        const removeCandidates = records
            .filter(r => {
                const nJson = JSON.stringify(n)
                return r.dataset.status !== 'REMOVED' && r.dataset.data === nJson
            })
        if (removeCandidates.length > 0) {
            const removable = removeCandidates[removeCandidates.length - 1]
            removable.dataset.status = "REMOVED"
            removable.classList.remove('status-new')
            removable.classList.remove('status-established')
            removable.classList.add('status-removed')
        }
    })
}

function initTable(keys) {
    const recordHeader = document.getElementById('records-header')
    recordHeader.innerHTML = ''
    const recordsBody = document.getElementById('records-body')
    recordsBody.innerHTML = ''

    const header = document.createElement('tr')
    keys.forEach(key => {
        const td = document.createElement('td')
        td.innerHTML = key
        header.appendChild(td)
    })
    recordHeader.appendChild(header)
}

function startup(editor) {
    let eventSource = null

    const executeButton = document.getElementById('execute-button')
    executeButton.onclick = async () => {
        if (eventSource) {
            eventSource.close()
        }

        const statusDisplay = document.getElementById('status-display')
        statusDisplay.style.display = 'visible'
        const recordsTable = document.getElementById('records')
        recordsTable.style.display = 'none';

        const response = await fetch('/ingraph/execute-query', {
            method: "POST",
            body: editor.getValue(),
            credentials: 'same-origin',
        })
        setStatus('Executing query')
        const results = await response.json()
        setStatus('Query executed')
    }

    const queryButton = document.getElementById('query-button')
    queryButton.onclick = async () => {
        if (eventSource) {
            eventSource.close()
        }

        setStatus('Registering query')
        const response = await fetch('/ingraph/register-query', {
            method: "POST",
            body: editor.getValue(),
            credentials: 'same-origin',
        })
        const session = await response.json()
        console.log(`Registered query with id: ${session.id}`)

        const statusDisplay = document.getElementById('status-display')
        statusDisplay.style.display = 'none'
        const recordsTable = document.getElementById('records')
        recordsTable.style.display = 'visible';

        initTable(session.keys)

        eventSource = new EventSource(`/ingraph/events?id=${session.id}`, {
            withCredentials: true,
        })
        eventSource.onopen = () => {
            statusDisplay.style.display = 'none'
        }
        eventSource.onmessage = (message) => {
            const delta = JSON.parse(message.data)
            renderDelta(session.keys, delta)
            console.log(message.data)
        }
        eventSource.onerror = (error) => {
            console.log(`Event stream error: ${JSON.stringify(error)}`)
            setStatus("Error")
        }
    }
}
