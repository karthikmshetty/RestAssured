package parameters;

import static io.restassured.RestAssured.*;

import java.util.concurrent.TimeUnit;

import org.hamcrest.Matchers;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

public class Get_QuerryParameter_Recrus {
	@Test
	
	public void getUser()
	{
		baseURI="https://reqres.in";
		
		given().queryParam("page",2)
		.when().get("/api/users")
		.then().assertThat().statusCode(200).contentType(ContentType.JSON).time(Matchers.lessThan(5000L),TimeUnit.MILLISECONDS).log().all();
		
	}

}
