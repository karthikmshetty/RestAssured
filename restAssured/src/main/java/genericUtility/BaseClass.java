package genericUtility;

import java.io.IOException;
import java.sql.SQLException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;
import objectRepository.LoginToYantraPage;

public class BaseClass {
	
	public DataBaseUtility du=new DataBaseUtility();
	public JavaUtility ju=new JavaUtility();
	public RestAssuredUtility ru=new RestAssuredUtility();
	public FileUtility fu=new FileUtility();
	public WebDriverUtility wu=new WebDriverUtility();
	public WebDriver driver;
	public RequestSpecification req;
	public ResponseSpecification respo;
	
	
	@BeforeSuite
	public void bsConfig() throws SQLException
	{
		du.connectDB();
		
		req=new RequestSpecBuilder().setBaseUri("http://rmgtestingserver:8084")
		                         .setContentType(ContentType.JSON).build();
	
		respo=new ResponseSpecBuilder().expectContentType(ContentType.JSON).build();
	}
	
	@BeforeClass
	public void beforeClassConfig() throws IOException
	{
	String BROWSER=fu.getPropertyKeyValue("browser");
	
	System.out.println(BROWSER);
	 
	if(BROWSER.equalsIgnoreCase("chrome"))
	{
		 driver=WebDriverManager.chromedriver().create();
	}
		if(BROWSER.equalsIgnoreCase("edge"))
		{
			driver=new EdgeDriver();
		}
		
		
		wu.maximizeWindow(driver);
	
	}
	
	@BeforeMethod
	public void beforeMethodConfig() throws IOException
	{
		String URL=fu.getPropertyKeyValue("url");
		driver.get(URL);
		
        wu.waitTillPageGetLoad(driver);		
	
        String USERNAME = fu.getPropertyKeyValue("username");
		String PASSWORD = fu.getPropertyKeyValue("password");
		
		LoginToYantraPage login = new LoginToYantraPage(driver);
		
		login.loginToApp(USERNAME, PASSWORD);
		}
	
	@AfterMethod
	public void afterMethodConfig()
	{
		
	}
		
	
	@AfterClass
	public void afterClassConfig()
	{
		driver.quit();
	}
	
	
	@AfterSuite
	public void asConfig() throws SQLException
	{
		du.closeDB();
	}
	
	

}
