package threeLayersTest;

import org.apache.commons.math3.geometry.euclidean.oned.Euclidean1D;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import genericUtility.BaseClass;
import genericUtility.EndPointUtility;
import genericUtility.IPathConstant;
import junit.framework.Assert;

import static io.restassured.RestAssured.*;

import java.sql.SQLException;

import objectRepository.CreateProjectPage;

public class AddProjectThreeLayer extends BaseClass {

	@Test
	public void verifyCreateProj() throws InterruptedException, SQLException
	{
	  	CreateProjectPage obj = new CreateProjectPage(driver);
	  	String projectName="BrinyAvactis"+ju.random();
	  	obj.createProj(projectName, "KarthikMShetty","On Gogin");
	  	Thread.sleep(2000);
	  	
	  	String projId = driver.findElement(By.xpath("//td[text()=\""+projectName+"\"]/preceding-sibling::td")).getText();
	  	System.out.println(projId);
	  	
	  	//API getting project which is created in GUI
	  	
        given().spec(req)
        .when().get(EndPointUtility.getSingleProject+projId)
        .then().assertThat().statusCode(200).log().all();
        System.out.println(" Retrieved data successfully");
        
        //check that data in database
        String query="select*from project;";
		String actData=du.readDataFromDBAndValidate(query,1, projId);
		
		Assert.assertEquals(projId, actData);
		System.out.println("TC Passed");
		
	  	
	  	
	}
}
