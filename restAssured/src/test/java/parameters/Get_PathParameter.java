package parameters;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.port;

import java.util.concurrent.TimeUnit;

import org.hamcrest.Matchers;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

public class Get_PathParameter {

	@Test
	public void getProj()
	{
		baseURI="http://rmgtestingserver";
		port=8084;
		
		given().pathParam("projId","TY_PROJ_8464")
		.when().get("/projects/{projId}")
		.then().assertThat().statusCode(200).contentType(ContentType.JSON).time(Matchers.lessThan(3000L),TimeUnit.MILLISECONDS)
		.log().all();
		
	}
	
}
