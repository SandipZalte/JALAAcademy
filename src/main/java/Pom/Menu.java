package Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class Menu {
	
	public Menu(WebDriver driver) {
		PageFactory.initElements(driver, this);
		
	}

}
