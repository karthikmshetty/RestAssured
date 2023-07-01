package crud_With_BDD_Recrus;

import static io.restassured.RestAssured.*;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import genericUtility.JavaUtility;
import io.restassured.http.ContentType;

public class CreateUser {
@Test
	public void createUser()
	{
		JavaUtility ju = new JavaUtility();
		// step1: Create the pre requisites - request body
		JSONObject jObj = new JSONObject();
		
		jObj.put("name","Karthi"+ju.random());
		jObj.put("job", "Tester");
		
		given().body(jObj).contentType(ContentType.JSON)
	   .when().post("https://reqres.in/api/users")
	   .then().assertThat().statusCode(201).contentType(ContentType.JSON).log().all();
		System.out.println("Successfully Created");
		
		
	}
	
}
