package Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class iFrames {

	public iFrames() {
		
	}

	public iFrames(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	

}
