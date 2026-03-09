package testScript;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import constant.Constant;
import pages.ManageNewsPage;
import utilities.ExcelUtility;

public class ManageNewsTest extends Base{
	
		@Test(priority=1)
		public void verifyTheUserIsAbleToLoginWithValidCredentialsAndManageNews() throws IOException 
		{
		String username=ExcelUtility.getStringData(1, 0, "loginpage");
		String password=ExcelUtility.getStringData(1, 1, "loginpage");
		String newsInput=ExcelUtility.getStringData(1, 2, "loginpage");
		
		ManageNewsPage managenewspage = new ManageNewsPage(driver);
		managenewspage.enterTheUsername(username);
		managenewspage.enterThePassword(password);
		managenewspage.clickSignInButton();
		
		boolean homepage=managenewspage.displayDashboard();
		Assert.assertTrue(homepage);
		managenewspage.clickMoreInfoButton();
		
		boolean managenews=managenewspage.displaymanageNewsText();
		Assert.assertTrue(managenews);
		managenewspage.clickNewButton();
		
		boolean newstitle=managenewspage.displayEnterNewsTitle();
		Assert.assertTrue(newstitle);
		managenewspage.inputTextToField(newsInput);
		
		managenewspage.clickSaveButton();
		managenewspage.alertDisplay();	
		}
		
		@Test(priority=2)
		public void verifyTheUserIsAbleToLoginWithValidCredentialsAndLogout() throws IOException
		{
			String username=ExcelUtility.getStringData(1, 0, "loginpage");
			String password=ExcelUtility.getStringData(1, 1, "loginpage");
			String newsInput=ExcelUtility.getStringData(1, 2, "loginpage");
			
			ManageNewsPage managenewspage = new ManageNewsPage(driver);
			managenewspage.enterTheUsername(username);
			managenewspage.enterThePassword(password);
			managenewspage.clickSignInButton();
			
			boolean homepage=managenewspage.displayDashboard();
			Assert.assertTrue(homepage);
			
			managenewspage.clickAdmin();
			managenewspage.clickLogout();
		}
		
		@Test(priority=3)
		public void verifyTheUserIsAbleToLoginWithValidCredentialsAndManageAdminUsers() throws IOException
		{
			String username=ExcelUtility.getStringData(1, 0, "loginpage");
			String password=ExcelUtility.getStringData(1, 1, "loginpage");
			String newsInput=ExcelUtility.getStringData(1, 2, "loginpage");
			String adminusername=ExcelUtility.getStringData(1, 3, "loginpage");
			String adminpassword=ExcelUtility.getStringData(1, 4, "loginpage");
			
			ManageNewsPage managenewspage = new ManageNewsPage(driver);
			managenewspage.enterTheUsername(username);
			managenewspage.enterThePassword(password);
			managenewspage.clickSignInButton();
			
			boolean homepage=managenewspage.displayDashboard();
			Assert.assertTrue(homepage);
			
			managenewspage.clickAdminUsersMoreInfoButton();
			managenewspage.clickAdminUsersNewButton();
			managenewspage.inputAdminUsername(adminusername);
			managenewspage.inputAdminPassword(adminpassword);
			managenewspage.selectAdminUsersType();
			managenewspage.saveAdminDetails();
			managenewspage.alertDisplayofAdmin();
		}
		
		@Test(priority=4)
		public void verifyTheUserIsAbleToLoginWithValidCredentialsAndManageCategory() throws IOException 
		{
		String username=ExcelUtility.getStringData(1, 0, "loginpage");
		String password=ExcelUtility.getStringData(1, 1, "loginpage");
		String newsInput=ExcelUtility.getStringData(1, 2, "loginpage");
		String filepath=Constant.IMAGEOFMANGO;
		String category=ExcelUtility.getStringData(1, 5, "loginpage");
		
		ManageNewsPage managenewspage = new ManageNewsPage(driver);
		managenewspage.enterTheUsername(username);
		managenewspage.enterThePassword(password);
		managenewspage.clickSignInButton();
		
		boolean homepage=managenewspage.displayDashboard();
		Assert.assertTrue(homepage);
		
		managenewspage.clickManageCategoryMoreInfoButton();
		managenewspage.clickCategoryNewButton();
		managenewspage.clickCategoryButton(category);
		managenewspage.clickDiscountButton();
		managenewspage.clickChooseFileButton(filepath);
		managenewspage.clickCategorySaveButton();
		managenewspage.alertDisplayofCategory();
		
		}
			
	

}
