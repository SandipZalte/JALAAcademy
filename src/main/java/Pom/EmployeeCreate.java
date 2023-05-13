package Pom;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EmployeeCreate {

	WebDriver driver;

	public EmployeeCreate(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "FirstName")
	private WebElement firstName;

	@FindBy(id = "LastName")
	private WebElement lastName;

	@FindBy(id = "EmailId")
	private WebElement email;

	@FindBy(id = "MobileNo")
	private WebElement mobileNumber;

	@FindBy(id = "DOB")
	private WebElement DateofBirth;

	@FindBy(xpath = "//input[@type='radio']")
	private WebElement gender;

	@FindBy(id = "Address")
	private WebElement address;

	@FindBy(id = "CountryId")
	private WebElement country;

	@FindBy(id = "CityId")
	private WebElement city;

	@FindBy(xpath = "//span[@class='checkmark']")
	private WebElement otherCity;

	@FindBy(xpath = "//input[@id='OtherCity']")
	private WebElement otherCityName;

	@FindBy(xpath = "(//div[@class='col-md-12 form-group'])[2]//input[@type='checkbox']") // here n is // Select 1to 6
	private WebElement skillchekbox;

	@FindBy(xpath = "//button[text()='Save']")
	private WebElement save;

	@FindBy(xpath = "//a[contains(text(),'Cancel')] ")
	private WebElement cancel;

	public void enterFirstName(String Firstname) {
		firstName.sendKeys(Firstname);
	}

	public void enterLastName(String lastname) {
		lastName.sendKeys(lastname);

	}

	public void enterEmail(String email) {
		Email.sendKeys(email);
	}

	public void enterMobileNumber(CharSequence[] mobiNumber) {
		MobileNumber.sendKeys(mobiNumber);
	}

	public void enterDOB(CharSequence[] DOB) {
		DateofBirth.sendKeys(DOB);

	}

	public void clickOnGenderRedioButton(String enterGenderLetter) {
		String GenderLetter = enterGenderLetter.toUpperCase();
		gender.findElement(By.xpath("//input[@value='" + GenderLetter + "']")).click();

	}

	public void enterAddress(String enteraddress) {
		address.sendKeys(enteraddress);

	}

	public void enterCountryName(String countryName) {
		country.sendKeys(countryName);
	}

	public void enterCityName(String cityName) {
		city.sendKeys(cityName);
	}

	public void enterotherCityName(String othercityName) {
		city.sendKeys(othercityName);
	}

	// select value 1to 6
	public void selectskillCheckBox(int n[]) {
		skillchekbox.isDisplayed();
		String path = "(//div[@class='col-md-12 form-group'])[2]//input[@type='checkbox' and @value='" + n + "']";
		List<WebElement> skillNum = skillchekbox.findElements(By.xpath(path));
		int size = skillNum.size();
		System.out.println(size);
		skillNum.forEach(s -> s.click());
	}

	public EmpSearch clickOnSaveButton() {
	save.click();
	return new EmpSearch(driver);
	
	}
	
	public EmpSearch clickOnCancelButton() {
		cancel.click();
		return new EmpSearch(driver);
		
		}
	
}
