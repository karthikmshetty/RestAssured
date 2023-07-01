package authentication;

import static io.restassured.RestAssured.*;

import org.testng.annotations.Test;

public class Digestive_Auth {
	@Test
	public void auth()
	{

		baseURI="http://rmgtestingserver";
		port=8084;
		
		given().auth().digest("rmgyantra","rmgy@9999")
		.when().get("/login")
		.then().assertThat().statusCode(202).log().all();

	}

}