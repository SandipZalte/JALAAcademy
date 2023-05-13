package Utility;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Wait {
	static WebDriver driver;
	public static WebElement waitForVisibilityOf(int timeInMillsec,WebElement element)
	{
		WebDriverWait wait= new  WebDriverWait(driver, Duration.ofMillis(timeInMillsec));
		wait.until(ExpectedConditions.visibilityOf(element));
		return element;
	}
	
	public static WebElement waitForVisibilityOfAllElements (int timeInMillsec,WebElement webElement)
	{
		WebDriverWait wait= new  WebDriverWait(driver, Duration.ofMillis(timeInMillsec));
		wait.until(ExpectedConditions.visibilityOfAllElements(webElement));
		return (WebElement) webElement;
	}

	public static WebElement waitForElementToBeClickable (int timeInMillsec,WebElement element)
	{
		WebDriverWait wait= new  WebDriverWait(driver, Duration.ofMillis(timeInMillsec));
		wait.until(ExpectedConditions.elementToBeClickable(element));
		return element;
	}
	public static WebElement waitForElementToBeSelected (int timeInMillsec,WebElement element)
	{
		WebDriverWait wait= new  WebDriverWait(driver, Duration.ofMillis(timeInMillsec));
		wait.until(ExpectedConditions.elementToBeSelected(element));
		return element;
	}
	public static String waitForUrlToBe(WebDriver driver,int timeInMillsec,String url)
	{
		WebDriverWait wait= new  WebDriverWait(driver, Duration.ofMillis(timeInMillsec));
		wait.until(ExpectedConditions.urlToBe(url));
		return url;
	}
	



public static List<WebElement> waitforanListOfElement (int timeInMillsec,List<WebElement> employee)
{
	WebDriverWait wait= new  WebDriverWait(driver, Duration.ofMillis(timeInMillsec));
	wait.until(ExpectedConditions.visibilityOfAllElements(employee));
	return employee;
}


}


