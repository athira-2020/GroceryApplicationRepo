package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ManageContactPage {

	public WebDriver driver;
	@FindBy(xpath = "//a[contains(@href,'list-contact') and contains(@class,'nav-link')]")
	WebElement buttonMoreInfo;
	@FindBy(xpath = "//h4[contains(@class,'card-title')]")
	WebElement contactUsText;
	@FindBy(xpath = "//a[contains(@class,'btncss')]")
	WebElement buttonPrimary;
	@FindBy(xpath = "//input[@id='phone']")
	WebElement phoneNumber;
	@FindBy(xpath = "//input[@id='email']")
	WebElement emailAddress;
	@FindBy(xpath = "//textarea[@name='address']")
	WebElement textareaAddress;
	@FindBy(xpath = "//textarea[@name='del_time']")
	WebElement deliveryTime;
	@FindBy(xpath = "//input[@id='del_limit']")
	WebElement deliveryCharge;
	@FindBy(xpath = "//button[@name='Update']")
	WebElement buttonUpdate;
	@FindBy(xpath = "//div[contains(@class,'alert-dismissible')]")
	WebElement alertDisplay;

	public ManageContactPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void clickMoreInfoButton() {
		buttonMoreInfo.click();
	}

	public boolean displayContactUsText() {
		return contactUsText.isDisplayed();
	}

	public void clickButtonPrimary() {
		buttonPrimary.click();
	}

	public void inputPhoneNumber(String phonenumber) {
		phoneNumber.clear();
		phoneNumber.sendKeys(phonenumber);
	}

	public void inputEmailAddress(String emailaddress) {
		emailAddress.clear();
		emailAddress.sendKeys(emailaddress);
	}

	public void inputAddress(String address) {
		textareaAddress.clear();
		textareaAddress.sendKeys(address);
	}

	public void inputDeliveryTime(String deliverytime) {
		deliveryTime.clear();
		deliveryTime.sendKeys(deliverytime);
	}

	public void inputDeliveryCharge(String deliverycharge) {
		deliveryCharge.clear();
		deliveryCharge.sendKeys(deliverycharge);
	}

	public void clickButtonUpdate() {
		Actions actions = new Actions(driver);
		actions.click(buttonUpdate).perform();
	}

	public boolean displayAlert() {
		return alertDisplay.isDisplayed();
	}

}
