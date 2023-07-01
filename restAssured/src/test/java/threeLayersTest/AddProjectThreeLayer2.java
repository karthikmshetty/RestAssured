package threeLayersTest;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import genericUtility.BaseClass;
import genericUtility.EndPointUtility;
import genericUtility.IPathConstant;
import io.restassured.response.Response;
import junit.framework.Assert;

import static io.restassured.RestAssured.*;

import java.sql.SQLException;

import objectRepository.CreateProjectPage;
import pojoClass_Package.PojoClass;

public class AddProjectThreeLayer2 extends BaseClass
{
	@Test
	public void addProj() throws InterruptedException, SQLException
	{
		
		//create project in front end layer
	CreateProjectPage obj = new CreateProjectPage(driver);
  	String projectName="Student"+ju.random();
  	obj.createProj(projectName, "KarthikMShetty","On Gogin");
  	Thread.sleep(2000);
  	
  	String projId = driver.findElement(By.xpath("//td[text()=\""+projectName+"\"]/preceding-sibling::td")).getText();
  	System.out.println(projId);
  	
  	
  	//update same project status in API
  	
  	 PojoClass obj1=new PojoClass(projectName, "KarthikMShetty","completed", 8);
  	
  	 Response resp=given().spec(req).body(obj1)
  	.when().put(EndPointUtility.updateProject+projId);
  	resp.then().assertThat().statusCode(200).log().all();
  	String data=ru.getJsonData(resp,"status");
  	System.out.println("---Updated in API---");
  	
  	
  	//verify in DATABASE
  	    String query="select*from project;";
		String actData=du.readDataFromDBAndValidate(query,5, data);
		System.out.println(actData);
		
		Assert.assertEquals(actData,"completed");
		System.out.println("TC Passed in DataBase");
		
	  	
  		
  	
}}
