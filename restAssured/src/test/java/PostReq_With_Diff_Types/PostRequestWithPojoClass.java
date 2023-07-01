package PostReq_With_Diff_Types;

import static io.restassured.RestAssured.given;

import org.testng.annotations.Test;

import genericUtility.JavaUtility;
import static io.restassured.RestAssured.*;
import io.restassured.http.ContentType;
import pojoClass_Package.PojoClass;

public class PostRequestWithPojoClass {
	
@Test
	public void createProjPojo()
	{
		
		JavaUtility ju = new JavaUtility();
		PojoClass pojoObj = new PojoClass("Likith","drupel"+ju.random(),"completed",5);
		
		baseURI="http://rmgtestingserver";
		port=8084;
		
		
		given().body(pojoObj).contentType(ContentType.JSON)
        .when().post("/addProject")
        .then().assertThat().statusCode(201).log().all();
        
	}
	
}
