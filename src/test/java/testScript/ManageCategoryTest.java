package testScript;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import constant.Constant;
import pages.LoginPage;
import pages.ManageCategoryPage;
import pages.ManageNewsPage;
import utilities.ExcelUtility;

public class ManageCategoryTest extends Base{
	
	@Test(priority=4)
	public void verifyTheUserIsAbleToLoginWithValidCredentialsAndManageCategory() throws IOException 
	{
	String username=ExcelUtility.getStringData(1, 0, "loginpage");
	String password=ExcelUtility.getStringData(1, 1, "loginpage");
	String newsInput=ExcelUtility.getStringData(1, 2, "loginpage");
	String filepath=Constant.IMAGEOFMANGO;
	String category=ExcelUtility.getStringData(1, 5, "loginpage");
	
	LoginPage loginpage=new LoginPage(driver);	
	loginpage.enterTheUsername(username);
	loginpage.enterThePassword(password);
	loginpage.clickSignInButton();		
	boolean homepage=loginpage.displayDashboard();
	Assert.assertTrue(homepage);
	
	ManageCategoryPage managecategorypage = new ManageCategoryPage(driver);	
	managecategorypage.clickManageCategoryMoreInfoButton();
	managecategorypage.clickCategoryNewButton();
	managecategorypage.clickCategoryButton(category);
	managecategorypage.clickDiscountButton();
	managecategorypage.clickChooseFileButton();
	managecategorypage.clickCategorySaveButton();
	managecategorypage.alertDisplayofCategory();		
	}

}
