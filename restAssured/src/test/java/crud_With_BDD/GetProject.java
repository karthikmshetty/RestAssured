package crud_With_BDD;

import static io.restassured.RestAssured.*;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;

public class GetProject {

	@Test
	public void getProj()

	{
	
		when().get("http://rmgtestingserver:8084/projects")
		.then().assertThat().statusCode(200).contentType(ContentType.JSON).log().all();
	}
}
