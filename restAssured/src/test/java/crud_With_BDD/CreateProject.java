package crud_With_BDD;

import static io.restassured.RestAssured.*;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import genericUtility.JavaUtility;
import io.restassured.http.ContentType;

public class CreateProject {

	@Test
	public void createProject()
	{

		JavaUtility ju = new JavaUtility();
		// step1: Create the pre requisites - request body
		JSONObject jObj = new JSONObject();
		jObj.put("createdBy","KarthiiShetty");
		jObj.put("projectName","Magento"+ju.random());
        jObj.put("status","Completed");
        jObj.put("teamSize",15);
        
        given().body(jObj).contentType(ContentType.JSON)
        .when().post("http://rmgtestingserver:8084/addProject")
        .then().assertThat().statusCode(201).log().all();
        
	
	}
	
}
