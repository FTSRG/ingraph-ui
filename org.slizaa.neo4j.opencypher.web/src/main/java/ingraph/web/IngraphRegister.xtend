package ingraph.web

import com.google.gson.Gson
import com.google.gson.JsonArray
import com.google.gson.JsonObject
import ingraph.driver.ingraph.IngraphDriver
import ingraph.model.fplan.Production
import java.io.IOException
import java.util.UUID
import java.util.stream.Collectors
import javax.servlet.ServletException
import javax.servlet.annotation.WebServlet
import javax.servlet.http.HttpServlet
import javax.servlet.http.HttpServletRequest
import javax.servlet.http.HttpServletResponse
import scala.collection.JavaConversions

@WebServlet(name='IngraphRegisterServices', urlPatterns='/ingraph/register-query')
class IngraphRegister extends HttpServlet {
	
	val gson = new Gson

	override protected doPost(HttpServletRequest request,
		HttpServletResponse response) throws ServletException, IOException {
		try {
			val query = request.reader.lines.collect(Collectors.joining)

			val session = DriverProvider::globalSession 
			val uuid = UUID.randomUUID().toString
			val handle = session.registerQuery(uuid, query)
			this.servletContext.setAttribute(uuid, handle);
			
			val prod = handle.adapter.plan as Production
			val keysIterable = JavaConversions.asJavaCollection(prod.outputNames)
			
			val responseObject = new JsonObject
			val keysArray = new JsonArray
			for (key : keysIterable) {
				keysArray.add(key);
			}
			responseObject.addProperty("id", uuid);
			responseObject.add("keys", keysArray)
			
			response.writer.append(responseObject.toString)
			response.setStatus(HttpServletResponse.SC_OK)
		} catch (Exception ex) {
			response.sendError(500, "Cannot parse query")
		}
	}
}
// MATCH (n) RETURN n; 