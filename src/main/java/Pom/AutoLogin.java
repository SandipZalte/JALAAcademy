package Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import Utility.Excel;
public class AutoLogin {
WebDriver driver;

	public static void loginUser(WebDriver driver) throws Exception {
		
		
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
		
	
	public AutoLogin(WebDriver driver){
		PageFactory.initElements(driver, this);
		
	}


}
