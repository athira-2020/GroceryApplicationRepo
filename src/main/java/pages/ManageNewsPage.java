package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import utilities.FileUploadUtility;
import utilities.PageUtility;

public class ManageNewsPage {
	
	public WebDriver driver;
	PageUtility pageutility=new PageUtility();	
	FileUploadUtility fileuploadutility=new FileUploadUtility();
	@FindBy(xpath="//input[@placeholder='Username']")WebElement usernamefield;
	@FindBy(xpath="//input[@placeholder='Password']")WebElement passwordfield;
	@FindBy(xpath="//button[@type='submit']")WebElement signInButton;
	@FindBy(xpath="//p[text()='Dashboard']")WebElement dashboardDisplay;
	
	@FindBy(xpath="//a[@class='small-box-footer' and contains(@href, 'list-news')]")WebElement moreInfoButton;
	@FindBy(xpath="//h1[text()='Manage News']")WebElement manageNewsText;
	@FindBy(xpath="//a[contains(@href,'news/add')]")WebElement newButton;
	@FindBy(xpath="//h3[@class='card-title']")WebElement enterNewsTitle;
	@FindBy(xpath="//textarea[@class='form-control']")WebElement inputTextField;
	@FindBy(xpath="//button[@type='submit']")WebElement saveButton;
	@FindBy(xpath="//div[contains(@class,'alert-dismissible')]")WebElement alertDisplay;
	
	
	
	public ManageNewsPage(WebDriver driver)
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
	
	public void inputTextToField(String input)
	{
		inputTextField.sendKeys(input);
	}
	
	public void clickSignInButton()
	{
		signInButton.click();
	}
	
	public boolean displayDashboard()
	{
		return dashboardDisplay.isDisplayed();
	}
	
	public void clickMoreInfoButton()
	{
		moreInfoButton.click();
	}
	
	public boolean displaymanageNewsText()
	{
		return manageNewsText.isDisplayed();
	}
	
	public void clickNewButton()
	{
		newButton.click();
	}
	
	public boolean displayEnterNewsTitle()
	{
		return enterNewsTitle.isDisplayed();
	}
	
	public void clickSaveButton()
	{
		saveButton.click();
	}
	
	public boolean alertDisplay()
	{
		return alertDisplay.isDisplayed();
	}
	
	
}
