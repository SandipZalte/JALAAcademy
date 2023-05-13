package Test;




import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Pojo.LaunchBrowser;

import Pom.AutoLogin;

import Pom.HomePage;
import Pom.LoginPage;


public class HomePageTest extends BaseClass {
	@BeforeMethod
	public void setup() throws Exception {
		driver = LaunchBrowser.ChromeBrowser();
		AutoLogin.loginUser(driver);
		

	}

	@AfterMethod
	public void tearDown() {

		// driver.quit();
	}

	@Test
	public void TestHomePageLogo() throws Exception {
		HomePage homePage = new HomePage(driver);
		homePage.Magnuslogo(driver);
		
	}

	@Test
	public void TestLogOut() throws Exception {
		HomePage homepage = new HomePage(driver);
		LoginPage loginPage=new LoginPage(driver) ;

		homepage.clickOnlogOut(driver);
		loginPage.validateLoginPageIsDisplay();
	}
	
	@Test
	public void TestUserInfo() {
		HomePage homepage = new HomePage(driver);
		homepage.userInfo();
	}

	@Test
	public void TestEmpDropdown() throws InterruptedException {
		HomePage homePage = new HomePage(driver);
		homePage.clickOnEmployee(driver);


	}
	@Test
	public void TestMoreDropdown() {
		HomePage homePage=new  HomePage(driver);
		homePage.clickOnMore(driver);

	}
	@Test
	public void TestSettings() {
		HomePage homePage=new  HomePage(driver);
		homePage.clickOnSettingsTab(driver);
		
		
	}

	


}
