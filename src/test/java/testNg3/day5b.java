package testNg3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class day5b {

	// passing the parameter via xml file
	
	WebDriver driver;
	@Parameters({"username","password"})
	@Test()
	public void login(String un , String pwd) {
		System.setProperty("webdriver.chrome.driver", "C://Users//Lenovo//Desktop//chromedriver//chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/v1/");
		driver.findElement(By.id("user-name")).sendKeys(un);
		driver.findElement(By.id("password")).sendKeys(pwd);
		driver.findElement(By.cssSelector("#login-button")).click();
		Assert.assertTrue(driver.getCurrentUrl().contains("inventory"));
	}
	
	
}
