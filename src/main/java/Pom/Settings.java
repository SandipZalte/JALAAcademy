package Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class Settings {
WebDriver driver;
	
public Settings(WebDriver driver) {
	PageFactory.initElements(driver, this);

}









}
