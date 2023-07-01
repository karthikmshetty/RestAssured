package PostReq_With_Diff_Types;

import java.util.HashMap;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import genericUtility.JavaUtility;
import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

public class Post_Request_With_HashMap {
@Test
	
	public void createProject()
	{
		JavaUtility ju = new JavaUtility();
		// step1: Create the pre requisites - request body
		HashMap<String,Object> mapObj = new HashMap();
		
		mapObj.put("createdBy","KarthiiShetty");
		mapObj.put("projectName","Magento"+ju.random());
		mapObj.put("status","Completed");
		mapObj.put("teamSize",15);
		
		baseURI="http://rmgtestingserver";
		port=8084;
		
		
  given().body(mapObj).contentType(ContentType.JSON)
  .when().post("/addProject")
  .then().assertThat().statusCode(201).contentType(ContentType.JSON).log().all();

	}
}
