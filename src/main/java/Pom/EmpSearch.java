package Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class EmpSearch {
	WebDriver driver;
	
	public EmpSearch(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
}
	
