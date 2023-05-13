package Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class Images {
WebDriver driver;
	public Images(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

}
