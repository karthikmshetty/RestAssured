package requestChaining;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import genericUtility.JavaUtility;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;

public class ReqChain_Recres {
	@Test
	public void reqChain()
	{

		baseURI="https://reqres.in";
		
		
		JavaUtility ju = new JavaUtility();
		// step1: Create the pre requisites - request body
		JSONObject jObj = new JSONObject();
		
		jObj.put("name","Karthii"+ju.random());
		jObj.put("job", "Tester");
		
		Response resp = given().body(jObj).contentType(ContentType.JSON)
		.when().post("/api/users");
		String userId = resp.jsonPath().get("id");
		resp.then().log().all();

		//delete the created user
		//directly concatinate variable no need of path parameter
		when().delete("/api/users"+userId)
		.then().assertThat().statusCode(204).log().all();
		System.out.println("Deleted successfuly");
		
		
	}

}
