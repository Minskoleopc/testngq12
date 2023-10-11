package testng;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class MyListeners  implements ITestListener   {
	
	WebDriver driver;
	
//    @Override
//    public void onTestStart(ITestResult result) {
//        System.out.println("Test started: " + result.getName());
//        System.out.println("STARTED");
//    }

    @Override
    public void onTestSuccess(ITestResult result) {
        System.out.println("Test passed: " + result.getName());
        System.out.println("PASSED");
    }

    @Override
    public void onTestFailure(ITestResult result) {
    	 Utilities.takeScreeshot(driver, result.getName());
        
        
    }
	
	
}
