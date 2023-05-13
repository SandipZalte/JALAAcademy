package Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class Popups {
	public Popups(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

}
