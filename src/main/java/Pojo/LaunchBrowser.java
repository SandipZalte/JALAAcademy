package Pojo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LaunchBrowser {
	
	public static WebDriver ChromeBrowser() {
		ChromeOptions co= new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		
		WebDriverManager.chromedriver().setup();
		//System.setProperty("webdriver.chrome.driver","C:\\Selenium jar file\\Browser Driver\\chromedriver(1).exe");
		WebDriver driver= new ChromeDriver (co);
		driver.navigate().to("https://magnus.jalatechnologies.com/");
		//https://magnus.jalatechnologies.com/
		//driver.get("https://magnus.jalatechnologies.com/");
		driver.manage().window().maximize();
		//driver.manage().timeouts().pageLoadTimeout(20,TimeUnit.MILLISECONDS);
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.MILLISECONDS);
		return driver;
			
		
	}

}
