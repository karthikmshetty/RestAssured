package threeLayersTestHardCode;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ThreeLayer {
	
	@Test
	public void proj() throws InterruptedException
	{
		
		WebDriver driver=WebDriverManager.chromedriver().create();
		driver.get("https://www.google.com");
		Thread.sleep(3000);
	}

}
