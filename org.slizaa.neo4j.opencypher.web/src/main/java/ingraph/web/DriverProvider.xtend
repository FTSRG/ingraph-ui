package ingraph.web

import ingraph.driver.ingraph.IngraphDriver
import ingraph.driver.ingraph.IngraphSession
import java.util.List
import java.util.Map

class DriverProvider {

	static val session = {
		val driver = new IngraphDriver
		driver.session
	}

	static def IngraphSession getGlobalSession() {
		return session
	}

}
