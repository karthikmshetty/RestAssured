package crud_With_BDD_Recrus;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

public class GetAllUser {
	
	@Test
	public void getSingleUser()
	{
		when().get("https://reqres.in/api/users?page=2")
		.then().assertThat().statusCode(200).contentType(ContentType.JSON).log().all();
		
	}

}
