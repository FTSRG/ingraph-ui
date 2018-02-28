package ingraph.web

import com.google.gson.JsonObject
import org.neo4j.driver.v1.Record
import org.neo4j.kernel.api.exceptions.InvalidArgumentsException

class ResultUtils {
	static dispatch def setValue(JsonObject jsonObj, String key, String value) {
		jsonObj.addProperty(key, value)
	}

	static dispatch def setValue(JsonObject jsonObj, String key, Integer value) {
		jsonObj.addProperty(key, value)
	}

	static dispatch def setValue(JsonObject jsonObj, String key, Float value) {
		jsonObj.addProperty(key, value)
	}

	static dispatch def setValue(JsonObject jsonObj, String key, Boolean value) {
		jsonObj.addProperty(key, value)
	}

	static dispatch def setValue(JsonObject jsonObj, String key, Long value) {
		jsonObj.addProperty(key, value)
	}

	static dispatch def setValue(JsonObject jsonObj, String key, Object value) {
		val className = value.class.name
		throw new InvalidArgumentsException('''Cannot add «className» to the JSON object''')
	}

	static def JsonObject convertResultToJson(Record record) {
		val jsonObj = new JsonObject
		for (field : record.fields) {
			jsonObj.setValue(field.key, field.value.asObject)
		}
		jsonObj
	}

}
