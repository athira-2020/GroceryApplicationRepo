package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.FileUploadUtility;
import utilities.PageUtility;

public class LogoutPage {
	public WebDriver driver;
	PageUtility pageutility=new PageUtility();	
	FileUploadUtility fileuploadutility=new FileUploadUtility();
	
	@FindBy(xpath="//a[@data-toggle='dropdown']")WebElement admin;
	@FindBy(xpath="//a[@class='dropdown-item' and contains(@href,'logout')]")WebElement logout;
	
	public LogoutPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void clickLogout()
	{
		logout.click();
	}

	public void clickAdmin() 
	{
		admin.click();		
	}

}
