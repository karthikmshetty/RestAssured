package authentication;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;

import org.testng.annotations.Test;

public class Barear_Token_2 {
	@Test
	public void getRepo()
	{
		//to get the repo 
		   baseURI="https://api.github.com";
	
		   given().auth().oauth2("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")
		   .when().get("repos/karthikmshetty/restRepo170")
		   .then().assertThat().statusCode(200).log().all();

}

}
