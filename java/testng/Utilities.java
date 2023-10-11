package testng;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Utilities {
	
	WebDriver driver;

	public static void takeScreeshot(WebDriver driver,String testName) {
	    TakesScreenshot screenshot = (TakesScreenshot) driver;
	    File srcFile = screenshot.getScreenshotAs(OutputType.FILE);
	    String path = "screenshots/"+testName +".png";
	    File destFile = new File(path);
	    try {
			FileUtils.copyFile(srcFile, destFile);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	} 
	
	
	

}
