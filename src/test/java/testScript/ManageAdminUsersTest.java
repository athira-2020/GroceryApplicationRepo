package testScript;

import java.io.IOException;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LoginPage;
import pages.ManageAdminUsersPage;
import utilities.ExcelUtility;

public class ManageAdminUsersTest extends Base{
	@Test(priority=1,description="Login and Manage AdminUsers")
	public void verifyTheUserIsAbleToLoginWithValidCredentialsAndManageAdminUsers() throws IOException
	{
		String username=ExcelUtility.getStringData(1, 0, "loginpage");
		String password=ExcelUtility.getStringData(1, 1, "loginpage");
		String adminusername=ExcelUtility.getStringData(1, 3, "loginpage");
		String adminpassword=ExcelUtility.getStringData(1, 4, "loginpage");
				
		LoginPage loginpage=new LoginPage(driver);	
		loginpage.enterTheUsername(username);
		loginpage.enterThePassword(password);
		loginpage.clickSignInButton();		
		boolean homepage=loginpage.displayDashboard();
		Assert.assertTrue(homepage);
		
		ManageAdminUsersPage manageadminuserspage = new ManageAdminUsersPage(driver);
		manageadminuserspage.clickAdminUsersMoreInfoButton();
		manageadminuserspage.clickAdminUsersNewButton();
		manageadminuserspage.inputAdminUsername(adminusername);
		manageadminuserspage.inputAdminPassword(adminpassword);
		manageadminuserspage.selectAdminUsersType();
		manageadminuserspage.saveAdminDetails();
		manageadminuserspage.alertDisplayofAdmin();
	}

}
