package testScript;

import java.io.IOException;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LoginPage;
import utilities.ExcelUtility;


public class LoginTest extends Base{
	
	@Test(priority=1)
	public void verifyTheUserIsAbleToLoginWithValidCredentials() throws IOException 
	{
	String username=ExcelUtility.getStringData(1, 0, "loginpage");
	String password=ExcelUtility.getStringData(1, 1, "loginpage");
	
	LoginPage loginpage=new LoginPage(driver);	
	loginpage.enterTheUsername(username);
	loginpage.enterThePassword(password);
	loginpage.clickSignInButton();
	
	boolean homepage=loginpage.displayDashboard();
	Assert.assertTrue(homepage);
	}

}
