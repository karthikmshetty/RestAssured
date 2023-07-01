package crud_without_BDD;

import java.util.Random;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import genericUtility.JavaUtility;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class CreateProject {
	@Test
	public void createProj()

	{
		
		JavaUtility ju = new JavaUtility();
		// step1: Create the pre requisites - request body
		JSONObject jObj = new JSONObject();
		jObj.put("createdBy","KarthiiShetty");
		jObj.put("projectName","Magento"+ju.random());
        jObj.put("status","Completed");
        jObj.put("teamSize",15);
        
        RequestSpecification req = RestAssured.given();
        req.body(jObj);
        req.contentType(ContentType.JSON);
        
        //step2: perform the action
        Response response = req.post("http://rmgtestingserver:8084/addProject");
        
        //step3: validate the response
        System.out.println(response.getContentType());
      // System.out.println(response.asString());       // response will be in one single line
        System.out.println(response.prettyPrint());     //response body will print 2 times
       // System.out.println(response.prettyPeek());    // response body will print one time
        

	}
}
