package testScript;

import java.io.IOException;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LoginPage;
import pages.ManageNewsPage;
import utilities.ExcelUtility;

public class ManageNewsTest extends Base {

	@Test(priority = 1, description = "Login and Manage News")
	public void verifyTheUserIsAbleToLoginWithValidCredentialsAndManageNews() throws IOException {
		String username = ExcelUtility.getStringData(1, 0, "loginpage");
		String password = ExcelUtility.getStringData(1, 1, "loginpage");
		String newsInput = ExcelUtility.getStringData(1, 2, "loginpage");

		LoginPage loginpage = new LoginPage(driver);
		loginpage.enterTheUsername(username);
		loginpage.enterThePassword(password);
		loginpage.clickSignInButton();
		boolean homepage = loginpage.displayDashboard();
		Assert.assertTrue(homepage);

		ManageNewsPage managenewspage = new ManageNewsPage(driver);
		managenewspage.clickMoreInfoButton();
		boolean managenews = managenewspage.displaymanageNewsText();
		Assert.assertTrue(managenews);
		managenewspage.clickNewButton();

		boolean newstitle = managenewspage.displayEnterNewsTitle();
		Assert.assertTrue(newstitle);
		managenewspage.inputTextToField(newsInput);

		managenewspage.clickSaveButton();
		managenewspage.alertDisplay();
	}

}
