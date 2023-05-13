package Test;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Pojo.LaunchBrowser;
import Pom.AdminLogin;
import Pom.ForgotPassword;
import Pom.LoginPage;
import Utility.Excel;

public class LoginPageTest extends BaseClass {
	@BeforeMethod
	public void setup() {
		driver = LaunchBrowser.ChromeBrowser();

	}

	@AfterMethod
	public void tearDown() {
		// driver.quit();

	}

	@Test(priority = 0)
	public void LoginWithValidCretialsTest() throws IOException, Exception {
		LoginPage loginPage = new LoginPage(driver);
		String id = Excel.getdata("login", 1, 0);
		String pass = Excel.getdata("login", 1, 1);
		loginPage.enterUserId(id);
		loginPage.enterPassword(pass);
		loginPage.clickOnCheckbox();
		loginPage.loginButton();
		String actTitle = "Login";
		String expTitle = driver.getTitle();
		Assert.assertEquals(actTitle, expTitle, "Title is Mismatched");

	}

	@Test(priority = 1)
	public void LoginWithInValidCretialsTest() throws IOException, Exception {
		LoginPage loginPage = new LoginPage(driver);
		String id = Excel.getdata("login", 2, 0);
		String pass = Excel.getdata("login", 2, 1);
		loginPage.enterUserId(id);
		loginPage.enterPassword(pass);
		loginPage.clickOnCheckbox();
		loginPage.loginButton();
		String actTitle = "Login";
		String expTitle = driver.getTitle();
		Assert.assertEquals(actTitle, expTitle, "Title is Mismatched");

	}

	@Test(priority = 2)
	public void enterValidUserIdOnForgotPasswordPageTest() throws Exception, IOException {
		LoginPage loginPage = new LoginPage(driver);
		
		ForgotPassword forgotPassword=
				loginPage.ClickForgotPassword();
		//ForgotPassword forgotPassword=new ForgotPassword(driver);
		
		String actTitle = "Forgot your password?";
		String expTitle = driver.getTitle();
		Assert.assertEquals(actTitle, expTitle, "ForgotPassword Title is Mismatched");
		String id = Excel.getdata("forgotpass", 1, 0);
		forgotPassword.enterEmailId(id);
		forgotPassword.clickOnGetPasswordButton(driver);
		String msg=forgotPassword.sucessWarningMsgText();
		System.out.println(msg);
		//Assert.assertEquals(msg,"Success!","Wrong Warning Msg");

		// forgotpassword.backButton();
	}
	@Test(priority = 3)
	public void openForgotPasswordPage() throws Exception, IOException {
		LoginPage loginPage = new LoginPage(driver);
		ForgotPassword forgotpassword = new ForgotPassword(driver);
		loginPage.ClickForgotPassword();
		String actTitle = "Forgot your password?";
		String expTitle = driver.getTitle();
		Assert.assertEquals(actTitle, expTitle, "Title is Mismatched");
		forgotpassword.backButton();
	}

	@Test(priority = 4)
	public void adminLoginTest() throws Exception {
		AdminLogin adminLogin = new AdminLogin(driver);
		LoginPage loginPage = new LoginPage(driver);
		loginPage.clickAdminLogin();
		String id = Excel.getdata("adminlogin", 2, 0);
		String pass = Excel.getdata("adminlogin", 2, 1);
		loginPage.enterUserId(id);
		loginPage.enterPassword(pass);

		adminLogin.enterUserid(id);
		adminLogin.enterPassword(pass);
		adminLogin.clickSignIn(driver);
		adminLogin.clickbackButton();

	}

//	@Test
//	public void warning() throws EncryptedDocumentException, IOException {
//		LoginPage lp = new LoginPage(driver);
//		LoginPage loginPage = new LoginPage(driver);
//		ForgotPassword forgotpassword = new ForgotPassword(driver);
//		loginPage.ClickForgotPassword();
//		String actTitle = "Forgot your password?";
//		String expTitle = driver.getTitle();
//		Assert.assertEquals(actTitle, expTitle, "Title is Mismatched");
//
//		String id = Excel.getdata("forgotpassword", 1, 0);
//		forgotpassword.emailId(id);
//
//		forgotpassword.passwordButton();
//		lp.successWarningMsg();
//	}

}
