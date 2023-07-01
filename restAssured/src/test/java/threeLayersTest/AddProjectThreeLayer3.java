package threeLayersTest;

import static io.restassured.RestAssured.*;

import java.sql.SQLException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import org.testng.annotations.Test;

import genericUtility.BaseClass;
import genericUtility.EndPointUtility;
import io.restassured.response.Response;
import pojoClass_Package.PojoClass;

public class AddProjectThreeLayer3 extends BaseClass{
	
	@Test
	public void createProj() throws SQLException, InterruptedException
	{
		
		//create project in API
		wu.waitTillPageGetLoad(driver);
		PojoClass pojoObj = new PojoClass("K Shetty", "Operation Kamala"+ju.random(), "On going",5);
		
	Response resp=given().spec(req).body(pojoObj)
		         .when().post(EndPointUtility.createProject);
	
	        String expProjId=ru.getJsonData(resp,"projectId");
	        resp.then().assertThat().statusCode(201).log().all();
	        System.out.println("Project created in Business Layer");
	        
	        //get the project in GUI

	        driver.findElement(By.xpath("//a[text()=\"Projects\"]")).click();
	        WebElement we = driver.findElement(By.xpath("//table[@class='table table-striped table-hover']/tbody/tr//td[.='"+expProjId+"']"));
	        String actData=we.getText();
	        
	        
             Assert.assertEquals(expProjId, actData);
             System.out.println("Project Present in GUI");
	        
	       
	        //verify the project in DataBase
	        String query="select*from project;";
	        String actDataId=du.readDataFromDBAndValidate(query,1,expProjId);
	        System.out.println(actDataId);
	        
	        
	        

	}

}
