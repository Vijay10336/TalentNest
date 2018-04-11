package com.csimplifyit.talentNest.Service;


import java.io.File;
import java.io.FileReader;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.springframework.stereotype.Service;

import com.csimplifyit.talentNest.utils.Constant;
import com.fasterxml.jackson.core.JsonParseException;

@Service
public class UrlJsonLoaderService {
	private static JSONArray webServiceArray;

	public void setJsonArray() {
		try {
			ClassLoader classLoader = getClass().getClassLoader();

			JSONParser parser = new JSONParser();
			File file = new File(classLoader.getResource("WebServiceJson.json").getFile());

			Object obj = parser.parse(new FileReader(file));
			webServiceArray = (JSONArray) obj;
		} catch (JsonParseException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public JSONObject getJson(String key) {
		JSONObject returnObj = null;
		try {
			if (webServiceArray == null) {
				setJsonArray();
			}
			for (int i = 0; i < webServiceArray.size(); i++) {
				JSONObject jObject = (JSONObject) webServiceArray.get(i);
				if (jObject.get(Constant.WEB_SERVICE_NAME).equals(key)) {
					returnObj = jObject;
					break;
				}

			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return returnObj;
	}

}
