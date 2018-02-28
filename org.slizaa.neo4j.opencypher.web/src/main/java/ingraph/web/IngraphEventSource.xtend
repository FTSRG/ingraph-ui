package ingraph.web

import com.google.gson.JsonArray
import com.google.gson.JsonObject
import ingraph.driver.data.IngraphDeltaHandler
import ingraph.driver.data.IngraphQueryHandler
import ingraph.model.fplan.Production
import java.io.IOException
import java.util.List
import java.util.concurrent.Executors
import java.util.concurrent.TimeUnit
import javax.servlet.annotation.WebServlet
import javax.servlet.http.HttpServletRequest
import org.neo4j.driver.v1.Record
import org.spark_project.jetty.servlets.EventSource
import org.spark_project.jetty.servlets.EventSource.Emitter
import org.spark_project.jetty.servlets.EventSourceServlet

import static extension ingraph.web.ResultUtils.*

@WebServlet(name='IngraphEventSourceServices', urlPatterns='/ingraph/events', asyncSupported=true)
class IngraphEventSource extends EventSourceServlet {

	override protected newEventSource(HttpServletRequest request) {
		val uuid = request.getParameter("id")
		val handle = this.servletContext.getAttribute(uuid) as IngraphQueryHandler

		return new EventSource {
			override onClose() {
				throw new UnsupportedOperationException("TODO: auto-generated method stub")
			}

			override onOpen(Emitter emitter) throws IOException {
				val scheduler = Executors.newScheduledThreadPool(1);
				scheduler.scheduleAtFixedRate(
					[handle.result],
					100,
					100,
					TimeUnit.MILLISECONDS
				)

				handle.registerDeltaHandler(new IngraphDeltaHandler {
					override keys() {
						val prod = handle.adapter.plan as Production
						prod.outputNames.toVector
					}

					override onChange(List<? extends Record> positive, List<? extends Record> negative) {
						if (positive.length == 0 && negative.length == 0)
							return;

						val positiveArray = new JsonArray
						for (p : positive) {
							val result = p.convertResultToJson
							positiveArray.add(result)
						}

						val negativeArray = new JsonArray
						for (n : negative) {
							val result = n.convertResultToJson
							negativeArray.add(result)
						}

						val deltaObject = new JsonObject
						deltaObject.add("positive", positiveArray)
						deltaObject.add("negative", negativeArray)

						println('''id: «uuid», data: «deltaObject.toString»''')
						emitter.data(deltaObject.toString)
					}
				})
			}
		}
	}

}
