package interviewQuestions;

import genericUtility.JavaUtility;
import groovy.grape.GrapeIvy;
import static io.restassured.RestAssured.*;

import org.testng.annotations.Test;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;
import pojoClass_Package.PojoClass;

public class ReqSpecAndRespSpecBuilder {
	@Test
	public void proj()
	{
		JavaUtility ju = new JavaUtility();
		
		PojoClass pObj = new PojoClass("KArthi","tyss"+ju.random(),"On Going",12);
		
		
		RequestSpecification reqst = new RequestSpecBuilder()
		.setBaseUri("http://rmgtestingserver:8084")
		.setContentType(ContentType.JSON).build();
		
		ResponseSpecification resp = new ResponseSpecBuilder()
		.expectContentType(ContentType.JSON)
		.expectStatusCode(201).build();
		
given().spec(reqst).body(pObj)
.when().post("/addProject")
.then().spec(resp).log().all();
		
	}

}
