package Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utility.Wait;

public class ForgotPassword {

	@FindBy(id = "Email")
	private WebElement emailid;

	@FindBy(id = "btnForgotPassword")
	private WebElement getpassbutton;

	@FindBy(xpath = "//a[text()='Back']")
	private WebElement backbutton;

	@FindBy(xpath = "(//div[@id='toast-container']//div[@class='toast-message' and text()='Error!'])")
	private WebElement errorWarning;

	@FindBy(xpath = "//div[@class='toast-message' and text()='Success!'])")
	//(//div[@id='toast-container']//div[@class='toast-message' and text()='Success!'])
	private WebElement SucessWarning;

	 WebDriver driver;

	public ForgotPassword(WebDriver driver) {
		this.driver= driver;
		PageFactory.initElements(driver, this);

	}

	public void enterEmailId(String enterEmailId) {
		emailid.sendKeys(enterEmailId);
	}

	public ForgotPassword clickOnGetPasswordButton(WebDriver driver) {

		getpassbutton.click();
		Wait.waitForVisibilityOf(20, getpassbutton);
		return new ForgotPassword(driver);
	}

	public String sucessWarningMsgText() {
		//Wait.waitForVisibilityOf(20, SucessWarning);
		System.out.println(SucessWarning.getAttribute("class"));
		System.out.println(SucessWarning.getText());

		return SucessWarning.getText();

	}

	public String errorWarningMsgText() {
		Wait.waitForVisibilityOf(20, errorWarning);

		return errorWarning.getText();

	}

	public ForgotPassword clickOnbackButton(WebDriver driver) {

		backbutton.click();
		return new ForgotPassword(driver);
	}

}
