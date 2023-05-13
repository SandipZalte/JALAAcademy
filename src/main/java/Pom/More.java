package Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public  class More {
	
	WebDriver driver;
	public More(WebDriver driver) {
	PageFactory.initElements(driver,this);
		
	}
	
	@FindBy(xpath = "")
	public WebElement multipleTabs;
	
	@FindBy(xpath = "")
	public WebElement menu;
	
	@FindBy(xpath = "")
	public WebElement autocomplete;
	
	@FindBy(xpath = "")
	public WebElement collapsibleContent;
	
	@FindBy(xpath = "")
	public WebElement images;
	
	@FindBy(xpath = "")
	public WebElement slider;
	
	@FindBy(xpath = "")
	public WebElement tooltips;
	
	@FindBy(xpath = "")
	public WebElement popups;
	
	@FindBy(xpath = "")
	public WebElement links;
	
	@FindBy(xpath = "")
	public WebElement cssProperites;
	
	@FindBy(xpath = "")
	public WebElement iframe;
	
	
	

	public MultipleTabs clickOnMultipleTabs() {
		multipleTabs.click();
		return new MultipleTabs(driver);

	}



	public Menu clickOnMenu() {
		menu.click();
		return new Menu(driver);

	}

	public Autocomplete clickOnAutocomplete() {
		return new Autocomplete(driver);

	}

	public CollapsibleContent clickOnCollapsibleContent() {
		return new  CollapsibleContent(driver);

	}

	public Images clickOnImages() {
		images.click();
		return new Images(driver);

	}

	public Slider clickOnSlider() {
		slider.click();
		return new Slider(driver);
		

	}

	public Tooltips clickOnTooltips() {
		tooltips.click();
		return new Tooltips(driver);
		
		

	}

	public Popups clickOnPopups() {
		popups.click();
		return new Popups(driver);

	}

	public Links clickOnLinks() {
		links.click();
		return new Links(driver);

	}

	public CssProperites clickOnCssProperites() {
		cssProperites.click();
		return new CssProperites(driver);

	}

	public iFrames clickOniFrames() {
		iframe.click();
		return new iFrames(driver);

	}

}
