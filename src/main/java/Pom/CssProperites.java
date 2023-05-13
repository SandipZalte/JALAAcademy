package Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class CssProperites {

	public CssProperites(WebDriver driver) {
		PageFactory.initElements(driver, this);

}
}
