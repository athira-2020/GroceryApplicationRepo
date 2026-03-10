package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import utilities.PageUtility;

public class ManageNewsPage {
	
	public WebDriver driver;
	PageUtility pageutility=new PageUtility();	
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
	@FindBy(xpath="//a[@data-toggle='dropdown']")WebElement admin;
	@FindBy(xpath="//a[@class='dropdown-item' and contains(@href,'logout')]")WebElement logout;
	@FindBy(xpath="//a[@class='small-box-footer' and contains(@href,'list-admin')]")WebElement adminUsersMoreInfoButton;
	@FindBy(xpath="//a[@class='btn btn-rounded btn-danger']")WebElement adminUsersNewButton;
	@FindBy(xpath="//input[@id='username']")WebElement adminUsersUsername;
	@FindBy(xpath="//input[@id='password']")WebElement adminUsersPassword;
	@FindBy(xpath="//select[@id='user_type']")WebElement adminUsersUserType;
	@FindBy(xpath="//button[@name='Create']")WebElement adminSaveButton;
	@FindBy(xpath="//div[contains(@class,'alert-dismissible')]")WebElement adminAlertDisplay;
	@FindBy(xpath="//a[contains(text(),'More info') and contains(@href,'list-category')]")WebElement manageCategoryMoreInfoButton;
	@FindBy(xpath="//a[contains(@href,'Category/add')]")WebElement categoryNewButton;
	@FindBy(xpath="//input[@id='category']")WebElement categoryButton;
	@FindBy(xpath="//li[contains(@class,'ms-hover') and contains(@id,'134-selectable')]")WebElement discountButton;
	@FindBy(xpath="//input[@id='main_img']")WebElement chooseFileButton;
	@FindBy(xpath="//button[@name='create']")WebElement categorySaveButton;
	@FindBy(xpath="//div[contains(@class,'alert-dismissible')]")WebElement categoryCreationAlert;
	
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
	
	public void clickAdmin()
	{
		admin.click();
	}
	
	public void clickLogout()
	{
		logout.click();
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
	
	public void clickManageCategoryMoreInfoButton()
	{
		manageCategoryMoreInfoButton.click();
	}
	
	public void clickCategoryNewButton()
	{
		categoryNewButton.click();
	}
	
	public void clickCategoryButton(String category)
	{
		categoryButton.sendKeys(category);
	}
	
	public void clickDiscountButton()
	{
		discountButton.click();
	}
	
	public void clickChooseFileButton(String filepath)
	{
		chooseFileButton.sendKeys(filepath);
	}
	
	public void clickCategorySaveButton()
	{
		categorySaveButton.click();
	}
	
	public boolean alertDisplayofCategory()
	{
		return categoryCreationAlert.isDisplayed();
	}
}
