package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginToYantraPage {
	
	@FindBy(id = "usernmae")
	private WebElement userText;
	
	@FindBy(id = "inputPassword")
	private WebElement passwordText;
	
	@FindBy(xpath = "//button[text()=\"Sign in\"]")
	private WebElement btn;
	
	
	public LoginToYantraPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	
		public WebElement getUserText() {
		return userText;
	}


	public WebElement getPasswordText() {
		return passwordText;
	}

	public WebElement getBtn() {
		return btn;
	}



	public void loginToApp(String username, String password)
	{
		userText.sendKeys(username);
		passwordText.sendKeys(password);
		btn.click();
		
	}

}
