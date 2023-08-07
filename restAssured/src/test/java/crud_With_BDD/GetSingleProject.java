package crud_With_BDD;

import static io.restassured.RestAssured.*;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;

public class GetSingleProject {
	@Test
public void getSingleProj()
{
	when().get("http://rmgtestingserver:8084/projects/TY_PROJ_7837")
	.then().assertThat().statusCode(200).contentType(ContentType.JSON).log().all();
}
	
}
