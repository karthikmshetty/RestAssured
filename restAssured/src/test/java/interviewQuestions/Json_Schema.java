package interviewQuestions;

import java.io.File;

import org.codehaus.jackson.schema.JsonSchema;
import org.testng.annotations.Test;

import io.restassured.module.jsv.JsonSchemaValidator;

import static io.restassured.RestAssured.*;

public class Json_Schema {
	
	//in companies in swagger document instead of json body, json schema will be given
	//so this is schema validation
	@Test
	public void schema()
	{
		File file = new File("./src/test/resources/jsonSchema.json");
      
		when().get("https://reqres.in/api/users?page=2")
		.then().assertThat().body(JsonSchemaValidator.matchesJsonSchema(file));
		System.out.println("vallidation successful");
		
	}
	
	
	

}
