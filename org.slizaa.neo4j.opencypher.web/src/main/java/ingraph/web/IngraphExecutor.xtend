package ingraph.web

import com.google.gson.JsonArray
import com.google.gson.JsonObject
import java.io.IOException
import java.util.stream.Collectors
import javax.servlet.ServletException
import javax.servlet.annotation.WebServlet
import javax.servlet.http.HttpServlet
import javax.servlet.http.HttpServletRequest
import javax.servlet.http.HttpServletResponse
import org.neo4j.driver.v1.StatementResult

import static extension ingraph.web.ResultUtils.*

@WebServlet(name='IngraphExecutionServices', urlPatterns='/ingraph/execute-query')
class IngraphExecutor extends HttpServlet {

	override protected doPost(HttpServletRequest request,
		HttpServletResponse response) throws ServletException, IOException {
		try {
			val query = request.reader.lines.collect(Collectors.joining)

			val session = DriverProvider::globalSession
			val results = session.run(query)

			val responseObject = new JsonObject
			val keysArray = new JsonArray
			for (key : results.keys) {
				keysArray.add(key);
			}
			responseObject.add("keys", keysArray)

			val resultArray = new JsonArray
			for (p : results.list) {
				val result = p.convertResultToJson
				resultArray.add(result)
			}
			responseObject.add("data", resultArray)

			response.writer.append(responseObject.toString)
			response.setStatus(HttpServletResponse.SC_OK)
		} catch (Exception ex) {
			response.sendError(500, "Cannot parse query")
		}
	}

}
