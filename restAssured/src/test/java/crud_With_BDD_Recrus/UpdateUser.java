package crud_With_BDD_Recrus;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import genericUtility.JavaUtility;
import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

public class UpdateUser {
	
	@Test
	public void updateUser()
	{
		
     JavaUtility ju = new JavaUtility();
     JSONObject jObj = new JSONObject();
     
     jObj.put("name","Karthii"+ju.random());
		jObj.put("job", "Tester");     
	
	
		given().body(jObj).contentType(ContentType.JSON)
		.when().put("https://reqres.in/api/users/2")
		.then().statusCode(200).contentType(ContentType.JSON).log().all();
			
	
	}

}
