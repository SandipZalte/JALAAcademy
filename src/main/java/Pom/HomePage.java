package Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utility.Wait;

public class HomePage {
	WebDriver driver;

	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);

	}

	// body[1]//div[2]//header[1]//a[1]//span[2]//b[1]
	// span[@class='logo-mini']//text()"
	@FindBy(xpath = "//body//div[2]//header//span[2]//b[text()]")
	private WebElement logo;

	// span[contains(text(),'Logout')]
	@FindBy(xpath = "(//body/div[2]//header//a//span[text()])[2]")
	private WebElement logout;

	public LoginPage clickOnlogOut(WebDriver driver) {
		Wait.waitForVisibilityOf(driver, 20, logout);
		logout.click();
		return new LoginPage(driver);

	}

	@FindBy(xpath = "//body//div[2]//aside//div[2]//p[1][text()]")
	private WebElement username;

	public String userNameInfoIsDislpayed() {

		// String actUserName = "Guest User";
		String expUserName = username.getText();

		return expUserName;
	}

	@FindBy(xpath = "//body//div[2]//aside//div//div//img")
	private WebElement userimage;

	public boolean userImageIsDisplayed(WebDriver driver) {
		boolean img = userimage.isDisplayed();
		return img;
	}

	@FindBy(xpath = "(//body//div[2]//aside//section//ul//li)[1][text()]")
	private WebElement home;

	public Home clickOnHome(WebDriver driver) {// Bug is Found it direct go to the Login page
		Wait.waitForVisibilityOfAllElements(driver, 20, home);
		home.click();
//		String ActTitle = "Magnus";
//		String expTitle = driver.getTitle();
//		SoftAssert softAssert = new SoftAssert();
//		softAssert.assertEquals(ActTitle, expTitle, "Home page title is Not Match");
//		String ActUrl = "Magnus";
//		String expUrl = driver.getCurrentUrl();
//		softAssert.assertEquals(ActUrl, expUrl, "Home page Url is Not Match");
//		softAssert.assertAll();
		return new Home(driver);

	}

	@FindBy(xpath = "//body//div[2]//aside//section//ul//li[2]//a[text()]")
	private WebElement employeedropmenu;

	public void clickOnEmpDropMenu(WebDriver driver) {

		Wait.waitForElementToBeClickable(driver, 10, employeedropmenu);
		
		employeedropmenu.click();

	}

	@FindBy(xpath = "//body//div[2]//aside//section//ul//li[2]//ul//li[1][text()]")
	// body//div[2]//aside//section//ul//li[2]//ul//li//a[text()]
	private WebElement empCreate;
	
	public EmployeeCreate clickOnEmployee(WebDriver driver) {
		Wait.waitForVisibilityOf(driver, 10, empCreate);
		empCreate.click();
		return new EmployeeCreate(driver);
	}
	
	@FindBy(xpath = "//body//div[2]//aside//section//ul//li[2]//ul//li[2][text()]")
	private WebElement empSearch;
	
	public EmpSearch clickOnEmpSearch(WebDriver driver) {
		Wait.waitForVisibilityOf(driver, 10, empSearch);
		empSearch.click();
		return new EmpSearch(driver);
	}

	@FindBy(xpath = "//body//div[2]//aside//section//ul//li[3]//a[text()]")
	private WebElement moredropmenu;
	
	public More clickOnMore(WebDriver driver) {
		Wait.waitForVisibilityOf(driver, 10, moredropmenu);
		moredropmenu.click();
		return new More(driver);
	}
	
	@FindBy(xpath = "//body//div[2]//aside//section//ul//li[4]//a[text()]")
	private WebElement setting;
	public Settings clickOnSettingsTab(WebDriver driver) {
		Wait.waitForVisibilityOf(driver, 20, setting);
		setting.click();
		return new Settings(driver);

	}
	@FindBy(xpath = "//h1")
	private WebElement welcometext;
	
	public String getWelcomeText() {
		String welcommsg=welcometext.getText();
		return welcommsg;

	}
	
	

	
//	@FindBy(xpath = "//body//div[2]//aside//section//ul//li[2]//ul//li//a[text()]")
//	private List<WebElement> listofempTab;
//
//	@FindBy(xpath = "//body/div[2]/aside/section/ul/li[3]//ul//li")
//	private List<WebElement> moredroplist;
//
//	/*
//	 * public void Magnuslogo(WebDriver driver) { logo.isDisplayed();
//	 * Wait.waitForVisibilityOf(driver, 20, logo); Assertion assertion = new
//	 * Assertion(); String expeUrl = driver.getCurrentUrl(); String actUrl =
//	 * "https://magnus.jalatechnologies.com/Home/Index";
//	 * assertion.assertEquals(expeUrl.equals(actUrl),
//	 * "Home Page Url is Miss match");
//	  */
//	
//	 
//
////		Wait.waitForVisibilityOfAllElements(driver, 10, more);
////		SoftAssert softAssert = new SoftAssert();
////		String ActUrl = "https://magnus.jalatechnologies.com/";
////		String expUrl = driver.getCurrentUrl();
////		softAssert.assertEquals(ActUrl, expUrl, "Home page Url is Not Match");
////		softAssert.assertAll();
////		Wait.waitForVisibilityOfAllElements(driver, 5, more);
////		((WebElement) moretablist).isDisplayed();
//
//	public void clickMoreTabOptionList(WebDriver driver) throws InterruptedException {
//		moredropmenu.click();
//		Wait.waitForVisibilityOfAllElements(driver, 10, moredropmenu);
//		int size = moredroplist.size();
//
//		/* title map */
//		// HashMap<Integer,String>moretabtitle =new HashMap<Integer, String>();
//
//		/* url map */
//		HashMap<Integer, String> expMoreTabUrl = new HashMap<Integer, String>();
//
//		HashMap<Integer, String> actualurl = new HashMap<Integer, String>();
//		
//		actualurl.put(0, "https://magnus.jalatechnologies.com/Home/Tabs");
//		actualurl.put(1, "https://magnus.jalatechnologies.com/Home/Menu");
//		actualurl.put(2, "https://magnus.jalatechnologies.com/Home/AutoComplete");
//		actualurl.put(3, "https://magnus.jalatechnologies.com/Home/Collapse");
//		actualurl.put(4, "https://magnus.jalatechnologies.com/Home/UploadImage");
//		actualurl.put(5, "https://magnus.jalatechnologies.com/Home/Slider");
//		actualurl.put(6, "https://magnus.jalatechnologies.com/Home/Tooltip");
//		actualurl.put(7, "https://magnus.jalatechnologies.com/Home/Popup");
//		actualurl.put(8, "https://magnus.jalatechnologies.com/Home/Links");
//		actualurl.put(9, "https://magnus.jalatechnologies.com/Home/CssProperty");
//		actualurl.put(10, "https://magnus.jalatechnologies.com/Home/Iframe");
//
//		for (int i = 0; i < size; i++) {
//
//			moredroplist.get(i).click();
//			Wait.waitForVisibilityOfAllElements(driver, 30, moredroplist.get(i));
//			expMoreTabUrl.put(i, driver.getCurrentUrl());
//			Wait.waitForVisibilityOf(driver, 20, moredroplist.get(i));
//			driver.navigate().back();
//			Wait.waitForVisibilityOf(driver, 20, moredroplist.get(i));
//
//		}
//
//		for (Map.Entry<Integer, String> entry : expMoreTabUrl.entrySet()) {
//			System.out.println(entry.getKey() + ": " + entry.getValue());
//		}
//		SoftAssert softAssert = new SoftAssert();
//		Boolean actual = actualurl.equals(expMoreTabUrl);
//
//		softAssert.assertTrue(actual, "page Url is Not Match");
//		softAssert.assertAll();
//		Wait.waitForVisibilityOf(driver, 5, (WebElement) moredroplist);
//		((WebElement) moredroplist).isDisplayed();
//		}
//	


	
}
