package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import genericUtility.WebDriverUtility;

public class CreateProjectPage {

	@FindBy(xpath = "//a[text()=\"Projects\"]")
	private WebElement projectModule;
	
	@FindBy(xpath = "//span[text()=\"Create Project\"]")
	private WebElement createProject;
	
	@FindBy(name = "projectName")
	private WebElement projectNameText;
	
	@FindBy(name = "createdBy")
	private WebElement createdByText;
	
	@FindBy(xpath = "//form[@action=\"#\"]/descendant::select[@name=\"status\"]")
	private WebElement statusField;

	@FindBy(xpath = "//input[@type=\"submit\"]")
	private WebElement btn;
	
	//constructor
	public CreateProjectPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}

	/**
	 * @return the projectModule
	 */
	public WebElement getProjectModule() {
		return projectModule;
	}

	/**
	 * @return the createProject
	 */
	public WebElement getCreateProject() {
		return createProject;
	}

	/**
	 * @return the projectNameText
	 */
	public WebElement getProjectNameText() {
		return projectNameText;
	}

	/**
	 * @return the createdByText
	 */
	public WebElement getCreatedByText() {
		return createdByText;
	}

	/**
	 * @return the statusField
	 */
	public WebElement getStatusField() {
		return statusField;
	}

	/**
	 * @return the btn
	 */
	public WebElement getBtn() {
		return btn;
	}
	
	
	public void createProj(String projectName,String createdBy,String value)
	{
		projectModule.click();
		createProject.click();
		projectNameText.sendKeys(projectName);
		createdByText.sendKeys(createdBy);
		
		 WebDriverUtility wu = new WebDriverUtility();
		 wu.selectInDropdown(value, statusField);
		 
		 btn.click();
		 
		 System.out.println("Project created successfully");
		
		
		
	}


	
	
	
}

