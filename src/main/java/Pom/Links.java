package Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class Links {

	public Links(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

}
