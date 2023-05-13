/**
 * 
 */
package Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;


public class Tooltips {

	public Tooltips(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

}
