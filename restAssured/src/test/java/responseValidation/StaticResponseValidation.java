package responseValidation;

import static io.restassured.RestAssured.*;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import junit.framework.Assert;

public class StaticResponseValidation {
	@Test
	public void staticResp()
	{
		//pre requisites
		String expData="TY_PROJ_6334";
		baseURI="http://rmgtestingserver";
		port=8084;
 
		//action
		Response resp = RestAssured.get("/projects");
		
		//validation
		String actData = resp.jsonPath().get("[0].projectId");
		Assert.assertEquals(expData,actData);
		System.out.println("Data Verified");
		
	}

}
