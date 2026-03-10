package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.FileUploadUtility;
import utilities.PageUtility;

public class ManageCategoryPage {
	public WebDriver driver;
	PageUtility pageutility=new PageUtility();	
	
	FileUploadUtility fileuploadutility=new FileUploadUtility();
	
	@FindBy(xpath="//a[contains(text(),'More info') and contains(@href,'list-category')]")WebElement manageCategoryMoreInfoButton;
	@FindBy(xpath="//a[contains(@href,'Category/add')]")WebElement categoryNewButton;
	@FindBy(xpath="//input[@id='category']")WebElement categoryButton;
	@FindBy(xpath="//li[contains(@class,'ms-hover') and contains(@id,'134-selectable')]")WebElement discountButton;
	@FindBy(xpath="//input[@id='main_img']")WebElement chooseFileButton;
	@FindBy(xpath="//button[@name='create']")WebElement categorySaveButton;
	@FindBy(xpath="//div[contains(@class,'alert-dismissible')]")WebElement categoryCreationAlert;
	
	public ManageCategoryPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
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
	
	/*public void click()
	{
		driver.navigate().to("https://selenium.qabible.in/drag-drop.php");
		WebElement input2 = driver.findElement(By.xpath("//span[text()='Draggable n°3']"));
		Actions actions = new Actions(driver);
		actions.click(input2).perform();
	}*/
		
	/*public void clickDiscountButton()
	{
		//discountButton.click();
		Actions actions = new Actions(driver);
		actions.moveToElement(discountButton).click().perform();
	}*/
	
	public void clickDiscountButton()
	{
	JavascriptExecutor js = (JavascriptExecutor) driver;
	js.executeScript("arguments[0].click();", discountButton);
	}
	
	public void clickChooseFileButton()
	{
		fileuploadutility.fileUploadUsingSendkeys(chooseFileButton, "IMAGEOFMANGO");
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
