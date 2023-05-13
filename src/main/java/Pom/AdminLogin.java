package Pom;

import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AdminLogin {
	@FindBy(id = "UserName")
	private WebElement userid;

	@FindBy(id = "Password")
	private WebElement password;

	@FindBy(id = "btnLogin")
	private WebElement signin;

	@FindBy(xpath = "//a[text()='Back']")
	private WebElement backbutton;
	
	

	public AdminLogin(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public void enterUserid(String id) {
		userid.sendKeys(id);
	}

	public void enterPassword(String pass) {
		password.sendKeys(pass);

	}

	public AdminLogin clickSignIn(WebDriver driver) {
		signin.click();
		return new AdminLogin(driver);
	}

	public LoginPage clickOnOnBackButton(WebDriver driver) {
		backbutton.click();
		return new LoginPage(driver);

	}

}
