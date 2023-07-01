package coops;

import static io.restassured.RestAssured.*;

import org.testng.annotations.Test;

import io.restassured.response.Response;

public class Oauth2_0 {
	@Test
	public void oauth2()
	{
		 Response resp = given()
				      .formParam("client_id","AvactisPro")
				      .formParam("client_secret","a3bd6561259b5c3ff7040fdf5f3970e7")
				      .formParam("grant_type","client_credentials")
				      .formParam("redirect_uri","http://avatis.com")
				      .formParam("code","authorization_code only")
				      
				      .when().post("http://coop.apps.symfonycasts.com/token");
		
		 //capture the access token from the response of above request
		 String token=resp.jsonPath().get("access_token");
		 System.out.println(token);
		 
		 //Create another request and use the token to access the APIs
		 given().auth().oauth2(token)
		 .pathParam("USER_ID",4582)
		 
		 .when().post("http://coop.apps.symfonycasts.com/api/{USER_ID}/eggs-count")
		 .then().log().all();
		 
		 
		 
	}

}
