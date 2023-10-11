package testng;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(MyListeners.class)
public class test15 {
	WebDriver driver;
	@Test
	public void TestCase1() {
		
	
		System.setProperty("webdriver.chrome.driver", "C://Users//Lenovo//Desktop//chromedriver//chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://www.webdriveruniversity.com/");
		driver.findElement(By.id("contact-us")).click();
		Set <String > handles = driver.getWindowHandles();
		boolean windowFound  = false;
		for( String wd:handles) {
			System.out.println(wd);
			driver.switchTo().window(wd);
			if(driver.getCurrentUrl().contains("Contact-Us")){
				windowFound = true;
			}
		}
		
		Assert.assertTrue(false);
		Utilities.takeScreeshot(driver, "abc");
	}

	@Test
	public void TestCase2() {
		System.out.println("Test case two pass");
		Assert.assertEquals(false, false);
	}

	@Test
	public void TestCase3() {
		System.out.println("Test case three pass");
		Assert.assertEquals(false, false);
	}

}
