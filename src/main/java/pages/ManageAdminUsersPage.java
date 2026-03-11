package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.PageUtility;

public class ManageAdminUsersPage {
	
	public WebDriver driver;
	PageUtility pageutility=new PageUtility();		
	@FindBy(xpath="//a[@class='small-box-footer' and contains(@href,'list-admin')]")WebElement adminUsersMoreInfoButton;
	@FindBy(xpath="//a[@class='btn btn-rounded btn-danger']")WebElement adminUsersNewButton;
	@FindBy(xpath="//input[@id='username']")WebElement adminUsersUsername;
	@FindBy(xpath="//input[@id='password']")WebElement adminUsersPassword;
	@FindBy(xpath="//select[@id='user_type']")WebElement adminUsersUserType;
	@FindBy(xpath="//button[@name='Create']")WebElement adminSaveButton;
	@FindBy(xpath="//div[contains(@class,'alert-dismissible')]")WebElement adminAlertDisplay;
	
	public ManageAdminUsersPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void clickAdminUsersMoreInfoButton()
	{
		adminUsersMoreInfoButton.click();
	}
	public void clickAdminUsersNewButton()
	{
		adminUsersNewButton.click();
	}
	
	public void inputAdminUsername(String adminusername)
	{
		adminUsersUsername.sendKeys(adminusername);
	}
	
	public void inputAdminPassword(String adminpassword)
	{
		adminUsersPassword.sendKeys(adminpassword);
	}

	public void selectAdminUsersType()
	{
		pageutility.dropDownIndex(adminUsersUserType, 1);
	}
	
	public void saveAdminDetails()
	{
		adminSaveButton.click();
	}
	
	public boolean alertDisplayofAdmin()
	{
		return adminAlertDisplay.isDisplayed();
	}

}
