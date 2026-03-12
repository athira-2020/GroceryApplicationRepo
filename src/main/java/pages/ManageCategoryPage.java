package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import constant.Constant;
import utilities.FileUploadUtility;

public class ManageCategoryPage {
	public WebDriver driver;
	FileUploadUtility fileuploadutility = new FileUploadUtility();
	@FindBy(xpath = "//a[contains(text(),'More info') and contains(@href,'list-category')]")
	WebElement manageCategoryMoreInfoButton;
	@FindBy(xpath = "//a[contains(@href,'Category/add')]")
	WebElement categoryNewButton;
	@FindBy(xpath = "//input[@id='category']")
	WebElement categoryButton;
	@FindBy(xpath = "//li[contains(@class,'ms-elem-selectable') and contains(@id,'134-selectable')]")
	WebElement discountButton;
	@FindBy(xpath = "//input[@id='main_img']")
	WebElement chooseFileButton;
	@FindBy(xpath = "//button[@name='create']")
	WebElement categorySaveButton;
	@FindBy(xpath = "//div[contains(@class,'alert-dismissible')]")
	WebElement categoryCreationAlert;

	public ManageCategoryPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void clickManageCategoryMoreInfoButton() {
		manageCategoryMoreInfoButton.click();
	}

	public void clickCategoryNewButton() {
		categoryNewButton.click();
	}

	public void clickCategoryButton(String category) {
		categoryButton.sendKeys(category);
	}

	public void clickDiscountButton() {
		discountButton.click();
	}

	public void clickChooseFileButton() {
		fileuploadutility.fileUploadUsingSendkeys(chooseFileButton, Constant.IMAGEOFMANGO);
	}

	public void clickCategorySaveButton() {
		Actions actions = new Actions(driver);
		actions.click(categorySaveButton).perform();
	}

	public boolean alertDisplayofCategory() {
		return categoryCreationAlert.isDisplayed();
	}

}
