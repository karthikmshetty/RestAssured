package crud_without_BDD;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import junit.framework.Assert;

public class DeleteProject {
	@Test
	public void deleteProj()
	{
		
		Response response = RestAssured.delete("http://rmgtestingserver:8084/projects/TY_PROJ_7803");
	    
	    //step3: validate the response
		
		response.then().log().all();  // print all the records from server.
		int actStatus=response.getStatusCode();
		Assert.assertEquals(204,actStatus);
	}

}
