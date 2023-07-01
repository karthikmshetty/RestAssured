package authentication;

import static io.restassured.RestAssured.*;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import genericUtility.JavaUtility;
import io.restassured.http.ContentType;

public class BarearToken_git {
@Test
	public void token()
	{
   baseURI="https://api.github.com";
   
   JavaUtility ju = new JavaUtility();
   JSONObject jObj = new JSONObject();
   jObj.put("name","restRepo"+ju.random());
   
   given().auth().oauth2("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").body(jObj).contentType(ContentType.JSON)
   .when().post("/user/repos")
   .then().statusCode(201).log().all();
   System.out.println("Created successfuly");



	}
}
