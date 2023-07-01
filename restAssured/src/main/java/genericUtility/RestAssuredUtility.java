package genericUtility;

import io.restassured.response.Response;

public class RestAssuredUtility {

	public String getJsonData(Response resp, String path)
	{
		String jsonData=resp.jsonPath().get(path);
		return jsonData;
	}
}
