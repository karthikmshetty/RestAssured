package threeLayersTest;

import genericUtility.BaseClass;
import genericUtility.BaseClass;
import genericUtility.EndPointUtility;
import io.restassured.response.Response;
import junit.framework.Assert;

import static io.restassured.RestAssured.*;

import java.sql.SQLException;

import org.testng.annotations.Test;

import pojoClass_Package.PojoClass;

public class  AddProjectTwoLayer extends BaseClass
{
	@Test
	public void addProject() throws SQLException
	{
		
		//Step1: create pre requisites
		PojoClass pojoObj = new PojoClass("Karthik","project123"+ju.random(),"on going",8);
		
		//send the request
		Response resp=given().spec(req).body(pojoObj)
		            .when().post(EndPointUtility.createProject);
		
		//capture the project id
		String expData=ru.getJsonData(resp,"projectId");
		
		//validate the id in database
		String query="select*from project;";
		String actData=du.readDataFromDBAndValidate(query,1, expData);
		
		Assert.assertEquals(expData, actData);
		System.out.println("TC Passed");
		
		resp.then().log().all();
		
	}

}
