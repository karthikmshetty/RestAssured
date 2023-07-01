package dataDrivenTesting;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import genericUtility.JavaUtility;
import io.restassured.http.ContentType;
import pojoClass_Package.PojoClass;

import static io.restassured.RestAssured.*;

public class dataDriven_1 {
	
	
	@Test(dataProvider = "data")
	public void createProject(String createdBy, String projectName, String status, int teamSize)
	{
		//Prerequisties
		 JavaUtility ju = new JavaUtility();
		 PojoClass pojoObj = new PojoClass(createdBy, projectName+ju.random(), status, teamSize);
		baseURI = "http://rmgtestingserver";
		port = 8084;
		
		
		given()
		 .body(pojoObj)
		 .contentType(ContentType.JSON)
	   
		//Actions
		.when()
		 .post("/addProject")
		 
		//Validation
		.then().log().all();
		
		
	}
	
	
	
	@DataProvider
	public Object[][] data()
	{
		Object[][] data = new Object[3][4];
		
		data[0][0] = "Chaitra";
		data[0][1] = "Dell";
		data[0][2] = "Completed";
		data[0][3] = 12;
		
		data[1][0] = "Vijay";
		data[1][1] = "HP";
		data[1][2] = "Created";
		data[1][3] = 15;
		
		data[2][0] = "Pavan";
		data[2][1] = "TYSS";
		data[2][2] = "On Going";
		data[2][3] = 20;
		
		
		return data;
	}

	
	
	
	
	
	
	
}
