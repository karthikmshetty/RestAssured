package PostReq_With_Diff_Types;

import java.io.File;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

public class PostRequestWith_JSONFile {
	
	@Test

public void createProject()

{
	File fileObj = new File("./src/test/resources/JSONFILE.json");	
	
	baseURI="http://rmgtestingserver";
	port=8084;
	
	given().body(fileObj).contentType(ContentType.JSON)
	.when().post("/addProject")
	.then().assertThat().statusCode(201).contentType(ContentType.JSON).log().all();

	
}

}
