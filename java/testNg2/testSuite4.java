package testNg2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class testSuite4 {
	WebDriver driver;
	
	@Test
	public void IframeTestCase() {
		
		System.setProperty("webdriver.chrome.driver", "C://Users//Lenovo//Desktop//chromedriver//chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://www.webdriveruniversity.com/IFrame/index.html");
		
		// Switching to the iframe through element 
		WebElement iframe = driver.findElement(By.cssSelector("#frame"));
		driver.switchTo().frame(iframe);
		boolean avail = driver.findElement(By.cssSelector("#div-main-nav > div > ul > li.active > a")).isDisplayed();
		Assert.assertTrue(avail);
	}
	
	
	@Test
	public void IframeTestCase2() {
		System.setProperty("webdriver.chrome.driver", "C://Users//Lenovo//Desktop//chromedriver//chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://www.webdriveruniversity.com/IFrame/index.html");
		// iframe by index
		driver.switchTo().frame(0);
		boolean avail = driver.findElement(By.cssSelector("#div-main-nav > div > ul > li.active > a")).isDisplayed();
		Assert.assertTrue(avail);
		driver.switchTo().defaultContent();
		System.out.println(driver.getTitle());
		Assert.assertTrue(driver.getTitle().contains("IFrame"));
		driver.close();
		
	}
	
	
	@Test
	public void IframeTestCase3() {
		
		System.setProperty("webdriver.chrome.driver", "C://Users//Lenovo//Desktop//chromedriver//chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://www.webdriveruniversity.com/IFrame/index.html");
		// iframe by  id or name
		driver.switchTo().frame("frame");
		boolean avail = driver.findElement(By.cssSelector("#div-main-nav > div > ul > li.active > a")).isDisplayed();
		Assert.assertTrue(avail);
	}
	
	
	
	
	
	
	
	
	
	
	
	

}
