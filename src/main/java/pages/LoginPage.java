package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.FileUploadUtility;
import utilities.PageUtility;

public class LoginPage {
	
	public WebDriver driver;
	PageUtility pageutility=new PageUtility();	
	FileUploadUtility fileuploadutility=new FileUploadUtility();
	@FindBy(xpath="//input[@placeholder='Username']")WebElement usernamefield;
	@FindBy(xpath="//input[@placeholder='Password']")WebElement passwordfield;
	@FindBy(xpath="//button[@type='submit']")WebElement signInButton;
	@FindBy(xpath="//p[text()='Dashboard']")WebElement dashboardDisplay;
	
	public LoginPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void enterTheUsername(String username)
	{
		usernamefield.sendKeys(username);
	}
	
	public void enterThePassword(String password)
	{
		passwordfield.sendKeys(password);
	}
	
	public void clickSignInButton()
	{
		signInButton.click();
	}
	
	public boolean displayDashboard()
	{
		return dashboardDisplay.isDisplayed();
	}

	

}
