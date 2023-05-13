package t2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.FindBy;
import org.testng.asserts.Assertion;

import Utility.Wait;
import io.github.bonigarcia.wdm.WebDriverManager;

public class a1 {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver(co);

		driver.get("https://magnus.jalatechnologies.com/");
		driver.manage().window().maximize();
		// driver.manage().timeouts().pageLoadTimeout(20,TimeUnit.MILLISECONDS);
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.MILLISECONDS);
		
		
		
		WebElement id = driver.findElement(By.id("UserName"));
		id.sendKeys("training@jalaacademy.com");
		WebElement pass = driver.findElement(By.id("Password"));
		pass.sendKeys("jobprogram");
		Thread.sleep(2000);
		WebElement loginbutton = driver.findElement(By.id("btnLogin"));
		loginbutton.click();
		Thread.sleep(2000);

		System.out.println("HomePage");
		System.out.println("Current t2 url is-->" + driver.getCurrentUrl());
		System.out.println("logo function test");

		//body[1]/div[2]/header[1]/a[1]/span[2]/b[1]
		WebElement logo = driver.findElement(By.xpath("//body//header//a//span"));
		logo.isDisplayed();
		Wait.waitForVisibilityOf(driver, 500, logo);
		Assertion assertion= new Assertion();
		String expeUrl = driver.getCurrentUrl();
		String actUrl = "https://magnus.jalatechnologies.com/Home/Index";
		assertion.assertEquals(expeUrl.equals(actUrl), "Home Page Url is Miss match");

		
		System.out.println("logout function test");
		//(//body/div[2]//header//a//span[text()])[2]
		
				WebElement logout = driver.findElement(By.xpath("//span[contains(text(),'Logout')]"));
				logout.isDisplayed();
				Wait.waitForVisibilityOf(driver, 500, logout);
				Assertion assertion1= new Assertion();
				
				String expeUrl1 = driver.getCurrentUrl();
				String actUrl1 = "https://magnus.jalatechnologies.com/Home/Index";
				assertion1.assertEquals(expeUrl1.equals(actUrl1), "Home Page Url is Miss match");

		
		
		//WebElement user = driver.findElement(By.xpath("//body//div[2]//aside//div[2]//p[1][text()]"));

		//System.out.println(user.getText());

//		//WebElement  list= driver.findElement(By.xpath("//body/div[2]/aside/section/ul/li"));
	
		/*
		 * more tab click
		 * 
		 */
		/*WebElement  more= driver.findElement(By.xpath("//body/div[2]/aside/section/ul/li[3]/a[text()]"));		
		more.click();
		Thread.sleep(100);
		List<WebElement> list= driver.findElements(By.xpath("//body/div[2]/aside/section/ul/li[3]//ul//li"));
		int size=list.size();
		HashMap<Integer,String>maptitle =new HashMap<Integer, String>();
		HashMap<Integer,String>mapurl =new HashMap<Integer, String>();
		for(int i=0;i<size;i++)
		{
			list.get(i).click();
			Thread.sleep(20);
			maptitle.put(i, driver.getTitle());
			mapurl.put(i, driver.getCurrentUrl());
			Thread.sleep(20);
			driver.navigate().back();
			Thread.sleep(100);
			
			
		}
		System.out.println("Title");
		for (Map.Entry<Integer, String> entry : maptitle.entrySet()) {
		      System.out.println(entry.getKey() + ": " + entry.getValue());
		}
		System.out.println("**************************************");
		System.out.println("Url");
		for (Map.Entry<Integer, String> entry : mapurl.entrySet()) {
		      System.out.println(entry.getKey() + ": " + entry.getValue());
		}
		//body/div[2]/aside/section/ul/li[3]//ul//li
		*/
		
//		WebElement  emp= driver.findElement(By.xpath("//body//div[2]//aside//section//ul//li[2]//a[text()]"));
//		String text=emp.getAttribute("text()");
//		System.out.println(text);
//		Thread.sleep(2000);
//		
//		emp.click();
//		
//		WebElement  create= driver.findElement(By.xpath("//body//div[2]//aside//section//ul//li[2]//ul//li//a[text()]"));
//		
//		
//		//body//div[2]//aside//section//ul//li[2]//ul//li//a[text()]
//		String crt=create.getAttribute("text()");
//		System.out.println("Attribute name is-->"+crt);
//		Thread.sleep(2000);
//		String texxt=create.getText();
//		System.out.println("create gettxt name-->"+texxt);
//		create.click();
//		
//		
//		Thread.sleep(2000);

//		driver.navigate().back();
//		Thread.sleep(2000);
//		System.out.println("=====================");
//		Thread.sleep(2000);
//		String crturl = driver.getCurrentUrl();
//		Thread.sleep(2000);
//		System.out.println(crturl);
//		Thread.sleep(2000);
//
//		WebElement h1=driver.findElement(By.xpath("//h1"));
//		Thread.sleep(2000);
//		//System.out.println(h1.getAttribute("//h1/parent::center"));
//		System.out.println(h1.getText());
//		System.out.println(h1.getAriaRole());
//		System.out.println(h1.getAccessibleName());
//		System.out.println(h1.getDomAttribute("text()"));
//		System.out.println(h1.getTagName());
//		
//		Thread.sleep(2000);
//		h1.getAttribute("tag");
//		
//		Thread.sleep(2000);

	}

}
