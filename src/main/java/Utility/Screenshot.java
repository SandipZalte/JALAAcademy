package Utility;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class Screenshot  {
	static WebDriver driver;
	public static void takeScreenshot(WebDriver driver, String name) throws IOException {
		String dt=DateTime.CurrentDateTime();
		TakesScreenshot tc= (TakesScreenshot) driver;
		File Source=tc.getScreenshotAs(OutputType.FILE);
		File Destination= new File("./JALAAcademy/src/test-output/screenshot"+name+" "+ dt + ".png" );
		FileHandler.copy(Source, Destination);
		
		
		
		
		
		
		
	}

}
