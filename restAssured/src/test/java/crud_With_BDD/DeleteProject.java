package crud_With_BDD;

import static io.restassured.RestAssured.*;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;

public class DeleteProject {
@Test
	public void deleteProj()
	{
		when().delete("http://rmgtestingserver:8084/projects/TY_PROJ_7836")
		.then().assertThat().statusCode(204).contentType(ContentType.JSON).log().all();
		
	}
}
