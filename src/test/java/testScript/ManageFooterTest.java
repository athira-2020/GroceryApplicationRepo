package testScript;

import java.io.IOException;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LoginPage;
import pages.ManageFooterPage;
import utilities.ExcelUtility;

public class ManageFooterTest extends Base{
	@Test(priority=1,description="Login and Manage Footer")
	public void verifyTheUserIsAbleToLoginWithValidCredentialsAndManageFooter() throws IOException
	{
		String username=ExcelUtility.getStringData(1, 0, "loginpage");
		String password=ExcelUtility.getStringData(1, 1, "loginpage");
		String address=ExcelUtility.getStringData(1, 6, "loginpage");
		String email=ExcelUtility.getStringData(1, 7, "loginpage");
		String phonenumber=ExcelUtility.getStringData(1, 8, "loginpage");
		
		LoginPage loginpage=new LoginPage(driver);	
		loginpage.enterTheUsername(username);
		loginpage.enterThePassword(password);
		loginpage.clickSignInButton();		
		boolean homepage=loginpage.displayDashboard();
		Assert.assertTrue(homepage);
		
		ManageFooterPage managefooterspage = new ManageFooterPage(driver);
		managefooterspage.clickMoreInfoButton();		
		boolean footertext=managefooterspage.displayFooterText();
		Assert.assertTrue(footertext);
		managefooterspage.clickButtonPrimary();
		boolean footertextinfo=managefooterspage.displayFooterTextInfo();
		Assert.assertTrue(footertextinfo);
		managefooterspage.inputAddress(address);
		managefooterspage.inputEmailAddress(email);
		managefooterspage.inputPhoneNumber(phonenumber);
		managefooterspage.clickButtonUpdate();
		boolean alert=managefooterspage.displayAlert();
		Assert.assertTrue(alert);
		
	}

}
