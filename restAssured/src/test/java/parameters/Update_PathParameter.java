package parameters;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.port;

import java.util.concurrent.TimeUnit;

import org.apache.poi.xwpf.usermodel.BodyElementType;
import org.hamcrest.Matchers;
import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import genericUtility.JavaUtility;
import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

public class Update_PathParameter {
	
	@Test
	public void updateProj()

	{
		
		JavaUtility ju = new JavaUtility();	

		JSONObject jObj = new JSONObject();

		jObj.put("createdBy","Likithc");
		jObj.put("projectName","Tyss"+ju.random());
		jObj.put("status","on going");
		jObj.put("teamSize",5);
		
		
		baseURI="http://rmgtestingserver";
		port=8084;
		
		given().pathParam("projId","TY_PROJ_8464").body(jObj).contentType(ContentType.JSON)
		.when().put("/projects/{projId}")
		.then().assertThat().statusCode(200).contentType(ContentType.JSON).time(Matchers.lessThan(2000L),TimeUnit.MILLISECONDS)
		.log().all();
		

		
	}
}
