package crud_without_BDD;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import junit.framework.Assert;

public class GetProject {
@Test
	public  void getProj() {

		
	Response response = RestAssured.get("http://rmgtestingserver:8084/projects");
    
    //step3: validate the response
	
	response.then().log().all();  // print all the records from server.
	int actStatus=response.getStatusCode();
	Assert.assertEquals(200,actStatus);

	
	}

}
