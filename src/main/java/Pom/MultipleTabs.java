package Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class MultipleTabs {

	public MultipleTabs(WebDriver driver) {
	 PageFactory.initElements(driver,this);
	}

}
