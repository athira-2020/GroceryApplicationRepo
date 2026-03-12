package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ManageFooterPage {

	public WebDriver driver;
	@FindBy(xpath = "//a[contains(@class,'small-box-footer') and contains(@href,'list-footertext')]")
	WebElement buttonMoreInfo;
	@FindBy(xpath = "//h4[@class='card-title']")
	WebElement footerText;
	@FindBy(xpath = "//a[contains(@href,'edit=1')]")
	WebElement buttonPrimary;
	@FindBy(xpath = "//h3[@class='card-title']")
	WebElement footerTextInfo;
	@FindBy(xpath = "//textarea[@id='content']")
	WebElement textareaAddress;
	@FindBy(xpath = "//input[@id='email']")
	WebElement emailAddress;
	@FindBy(xpath = "//input[@id='phone']")
	WebElement phoneNumber;
	@FindBy(xpath = "//button[@name='Update']")
	WebElement buttonUpdate;
	@FindBy(xpath = "//div[contains(@class,'alert-dismissible')]")
	WebElement alertDisplay;

	public ManageFooterPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void clickMoreInfoButton() {
		buttonMoreInfo.click();
	}

	public boolean displayFooterText() {
		return footerText.isDisplayed();
	}

	public void clickButtonPrimary() {
		buttonPrimary.click();
	}

	public boolean displayFooterTextInfo() {
		return footerTextInfo.isDisplayed();
	}

	public void inputAddress(String address) {
		textareaAddress.clear();
		textareaAddress.sendKeys(address);
	}

	public void inputEmailAddress(String emailaddress) {
		emailAddress.clear();
		emailAddress.sendKeys(emailaddress);
	}

	public void inputPhoneNumber(String phonenumber) {
		phoneNumber.clear();
		phoneNumber.sendKeys(phonenumber);
	}

	public void clickButtonUpdate() {
		Actions actions = new Actions(driver);
		actions.click(buttonUpdate).perform();
	}

	public boolean displayAlert() {
		return alertDisplay.isDisplayed();
	}

}
