package authentication;

import static io.restassured.RestAssured.*;

import org.testng.annotations.Test;

public class Barear_Token_3_dlte_repo {
	@Test
	public void dlteRepo()
	{

		baseURI="https://api.github.com";
		
		given().auth().oauth2("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")
		.when().delete("/repos/karthikmshetty/restRepo115")
		.then().statusCode(204).log().all();
		System.out.println("-----Repo deleted successfuly-----");
	}
	   
}
