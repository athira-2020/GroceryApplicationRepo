package testScript;

import java.io.IOException;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LoginPage;
import pages.ManageContactPage;
import utilities.ExcelUtility;

public class ManageContactTest extends Base{

	@Test(priority=1,description="Login and Manage Contacts")
	public void verifyTheUserIsAbleToLoginWithValidCredentialsAndManageContact() throws IOException
	{
		String username=ExcelUtility.getStringData(1, 0, "loginpage");
		String password=ExcelUtility.getStringData(1, 1, "loginpage");
		String address=ExcelUtility.getStringData(1, 6, "loginpage");
		String email=ExcelUtility.getStringData(1, 7, "loginpage");
		String phonenumber=ExcelUtility.getStringData(1, 8, "loginpage");
		String deliverytime=ExcelUtility.getStringData(1, 9, "loginpage");
		String deliverycharge=ExcelUtility.getStringData(1, 10, "loginpage");
		
		LoginPage loginpage=new LoginPage(driver);	
		loginpage.enterTheUsername(username);
		loginpage.enterThePassword(password);
		loginpage.clickSignInButton();		
		boolean homepage=loginpage.displayDashboard();
		Assert.assertTrue(homepage);
		
		ManageContactPage managecontactspage = new ManageContactPage(driver);
		managecontactspage.clickMoreInfoButton();		
		boolean contactustext=managecontactspage.displayContactUsText();
		Assert.assertTrue(contactustext);
		managecontactspage.clickButtonPrimary();
		managecontactspage.inputPhoneNumber(phonenumber);		
		managecontactspage.inputEmailAddress(email);
		managecontactspage.inputAddress(address);
		managecontactspage.inputDeliveryTime(deliverytime);
		managecontactspage.inputDeliveryCharge(deliverycharge);
		managecontactspage.clickButtonUpdate();
		boolean alert=managecontactspage.displayAlert();
		Assert.assertTrue(alert);
	}
}
