package testNg3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class day2c {
	WebDriver driver;

	@BeforeMethod
	public void login() {
		System.setProperty("webdriver.chrome.driver", "C://Users//Lenovo//Desktop//chromedriver//chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com");	
	}
	@Test
	public void validateLoginSuccess() {
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		driver.findElement(By.id("login-button")).click();
		boolean avail = driver.getCurrentUrl().contains("inventory");
		Assert.assertTrue(avail);
	}
	
	@Test
	public void validateLoginonFailuser() {
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.id("password")).sendKeys("secet_sce");
		driver.findElement(By.id("login-button")).click();
		boolean avail  = driver.findElement(By.cssSelector("svg")).isDisplayed();
		Assert.assertTrue(avail);
	}
	
	@AfterMethod
	public void BroswerClose() {
		driver.close();
	}

}
