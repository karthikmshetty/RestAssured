package responseValidation;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.port;

import java.util.List;

import org.junit.Assert;
import org.testng.annotations.Test;

import io.restassured.response.Response;

import static io.restassured.RestAssured.*;

public class DynamicResponseValidation {
	@Test
	public void dynamicResp()
	{
		
		baseURI="http://rmgtestingserver";
		port=8084;
        String expData="TY_PROJ_8502";
        boolean flag=false;
        
        Response resp = when().get("/projects");
        
        List<String> projId = resp.jsonPath().get("projectId");
        
        for(String actData:projId)
        {
        	if(actData.equals(expData))
        		flag=true;
        }
        Assert.assertTrue(flag);
        System.out.println("Data Verified");
        }

}
