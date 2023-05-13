package Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Home {
	WebDriver driver;
	public Home (WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath = "//h1")
	private WebElement welcometext;
	
	@FindBy(xpath="(//b[text()])[4]")
	private WebElement gettextvalue;
	
	public String getWelcomePageText() {
		
			String ActAttributetext=	welcometext.getAttribute("text()");
				return ActAttributetext;

	}
	public String getText() {
		String ActualText=gettextvalue.getText();
		return ActualText;
		
	}

}
