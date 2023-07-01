package crud_With_MAP;

import static  io.restassured.RestAssured.*;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

public class createProject {
	
	
	@Test
	public void createProj() throws EncryptedDocumentException, FileNotFoundException, IOException
	{
		
		
		 createProject_Map obj = new createProject_Map();
		
		given().body(obj.createProj()).contentType(ContentType.JSON)
	    .when().post("http://rmgtestingserver:8084/addProject")
		.then().assertThat().statusCode(201).contentType(ContentType.JSON).log().all();
		
	}

}
