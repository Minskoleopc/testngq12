package testNg2;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class testSuiteOne {
	
	WebDriver driver;
	
	@Test
	public void testCase() {
		
		System.setProperty("webdriver.chrome.driver", "C://Users//Lenovo//Desktop//chromedriver//chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://www.webdriveruniversity.com/");
		WebElement  e = driver.findElement(By.cssSelector("#contact-us"));
		e.click();
		driver.close();
		
		
	}
	
	@Test
	public void testCaseTwo() {
		
		System.setProperty("webdriver.chrome.driver", "C://Users//Lenovo//Desktop//chromedriver//chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://www.webdriveruniversity.com/");
		WebElement  e = driver.findElement(By.cssSelector("#contact-us"));
		String script = "arguments[0].click()";
		JavascriptExecutor je = (JavascriptExecutor)driver;
		je.executeScript(script, e);
		
		
	}
	// scrolling-around
	
	@Test
	public void testCaseThree() {
		
		System.setProperty("webdriver.chrome.driver", "C://Users//Lenovo//Desktop//chromedriver//chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://www.webdriveruniversity.com/");
		WebElement  e = driver.findElement(By.cssSelector("#scrolling-around"));
		String script = "arguments[0].scrollIntoView(true)";
		JavascriptExecutor je = (JavascriptExecutor)driver;
		je.executeScript(script, e);
		
	}
	// <h1 data-cy = "two">Hello<h1>
	
	@Test
	public void testCaseFour() {
		// adding the attribute to the element
		System.setProperty("webdriver.chrome.driver", "C://Users//Lenovo//Desktop//chromedriver//chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://www.webdriveruniversity.com/");
		WebElement  e = driver.findElement(By.cssSelector("#scrolling-around"));
		String script = "arguments[0].setAttribute('data-cy','two')";
		JavascriptExecutor je = (JavascriptExecutor)driver;
		je.executeScript(script, e);
		String attributeVal = e.getAttribute("data-cy");
		Assert.assertEquals(attributeVal, "two");
		//driver.close();
		
	}
	
	@Test
	public void testCaseFive() {
		// adding the attribute to the element
		System.setProperty("webdriver.chrome.driver", "C://Users//Lenovo//Desktop//chromedriver//chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://www.webdriveruniversity.com/");
//		String title = driver.getTitle();
//		Assert.assertEquals(title, "WebDriverUniversity.com");
		String script = "return document.title";
		JavascriptExecutor je = (JavascriptExecutor)driver;
		String actualTitle = (String) je.executeScript(script);
		Assert.assertEquals(actualTitle, "WebDriverUniversity.com");
		
		
	}

	
	// click , scrollIntoView , title , attributeget and set , remove,
	
	// 9:30 am - action class in selenium
	// 9:30 pm testNg

}
