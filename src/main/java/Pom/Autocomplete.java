package Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class Autocomplete {
	public Autocomplete(WebDriver driver) {
		PageFactory.initElements(driver, this);
		
	}

}
