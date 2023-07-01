package PostReq_With_Diff_Types;

import static io.restassured.RestAssured.*;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import genericUtility.JavaUtility;
import io.restassured.http.ContentType;

public class Post_Request_With_JSONObj {

	@Test
	public void createProj()
	{
		
JavaUtility ju = new JavaUtility();	

JSONObject jObj = new JSONObject();

jObj.put("createdBy","Sachin sachi");
jObj.put("projectName","Tyss"+ju.random());
jObj.put("status","on going");
jObj.put("teamSize",5);

baseURI="http://rmgtestingserver";
port=8084;

   given().body(jObj).contentType(ContentType.JSON)
   .when().post("/addProject")
   .then().assertThat().statusCode(201).contentType(ContentType.JSON).log().all();



	}
}
