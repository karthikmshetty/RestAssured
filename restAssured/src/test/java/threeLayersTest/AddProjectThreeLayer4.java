package threeLayersTest;

import java.sql.SQLException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import genericUtility.BaseClass;
import genericUtility.EndPointUtility;

import static  io.restassured.RestAssured.*;

public class AddProjectThreeLayer4 extends BaseClass
{
	@Test
	public void createProj() throws SQLException
	{
		
		//Insert or create project in DB5
		
		String projectId="DP#007"+ju.random();
		String query="insert into project values('"+projectId+"','DP Shetty','29/06/23','operationKamala','completed',5);";
		int status=du.insertIntoDB(query);
		  
		Assert.assertEquals("1",""+status+"");
		System.out.println("Updated in DB");
		
		//Get The project in API
            given().spec(req)	
            .when().get(EndPointUtility.getSingleProject+projectId)
            .then().assertThat().statusCode(200).log().all();
            System.out.println("Project present in API Layer");
            
            
            //verify the project in GUI
            driver.findElement(By.xpath("//a[text()=\"Projects\"]")).click();
	        WebElement we = driver.findElement(By.xpath("//table[@class='table table-striped table-hover']/tbody/tr//td[.='"+projectId+"']"));
	        String actData=we.getText();
	        
	        
             Assert.assertEquals(projectId, actData);
             System.out.println("Project Present in GUI");
            
            
	}
	
	
	
	

}
