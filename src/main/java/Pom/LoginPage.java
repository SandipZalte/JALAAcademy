package Pom;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.asserts.SoftAssert;

import Utility.Wait;

public class LoginPage extends Base {

	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);

	}

	@FindBy(id = "UserName")
	private WebElement userid;

	@FindBy(id = "Password")
	private WebElement userpass;

	@FindBy(xpath = "//span[@class='checkmark']")
	private WebElement checkmark;

	@FindBy(id = "btnLogin")
	private WebElement loginbutton;

	@FindBy(xpath = "//a[contains(text(),'Forgot Password')]")
	private WebElement forgotpass;

	@FindBy(xpath = "//*[@id=\"frmForgotPassword\"]/div[1]/span[2]/span[text()]")
	private WebElement success_warning_msg;
	
	@FindBy(xpath="//div[contains(@class,'alert-dismissible')]")
	private WebElement invalidCredentailsWarningMessage;

	@FindBy(id = "toast-container")
	private WebElement adminlogin;

	@FindBy(xpath = "//title[text()='Magnus']")
	private  WebElement homepage;

	@FindBy(xpath = "h2[text()=' Login Credentials']")
	private  WebElement loginCredentials;

	public void validateloginpageUrl(WebDriver driver) throws Exception, IOException {
		Wait.waitForVisibilityOfAllElements(driver, 0, loginCredentials);
		String actUrl = "https://magnus.jalatechnologies.com/";
		String expUrl = driver.getCurrentUrl();
		SoftAssert softAssert = new SoftAssert();
		softAssert.assertEquals(actUrl, expUrl, "Home page Url is Not Match");
		softAssert.assertAll();

	}

	public void enterUserId(String enterid) throws Exception, IOException {
		userid.sendKeys(enterid);

	}

	public void enterPassword(String enterpass) throws EncryptedDocumentException, IOException {

		userpass.sendKeys(enterpass);
	}

	public void clickOnCheckbox() {
		checkmark.click();

	}

	public HomePage loginButton() {
		loginbutton.click();
		return new HomePage(driver);
	}

	public ForgotPassword ClickForgotPassword() {
		forgotpass.click();
		return  new ForgotPassword(driver);
	}

	/*Not Relevent field
 * 
 */
	public void successWarningMsg() {
		String expected = null;
		success_warning_msg.getAttribute(expected);
		String actual = "Your password sent successfully to your registered email.";
		// expected.equals(expected);
		System.out.println(expected);
		System.out.println(actual);
	}

	public AdminLogin clickAdminLogin() {
		adminlogin.click();
		return new AdminLogin(driver);
	}

	public String validateLoginPageIsDisplay() {
		String loginpageText = loginCredentials.getAttribute("text()");

		return loginpageText;

	}
}
