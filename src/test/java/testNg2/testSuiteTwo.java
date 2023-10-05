package testNg2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class testSuiteTwo {
	
	WebDriver driver;
	Actions ac;
	
	@BeforeMethod
	public void intializeBrowser() {
		System.setProperty("webdriver.chrome.driver", "C://Users//Lenovo//Desktop//chromedriver//chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://www.webdriveruniversity.com/Actions/index.html");
		ac = new Actions(driver);
	}
	
	
	@Test
	public void TestCase() {
		
		
		WebElement draggable = driver.findElement(By.id("draggable"));
		WebElement droppable = driver.findElement(By.id("droppable"));
		ac.dragAndDrop(draggable, droppable).build().perform();
		Assert.assertEquals(droppable.getText(), "Dropped!");
		driver.close();
	}
	
	@Test
	public void TestCaseTwo() {
		WebElement ele = driver.findElement(By.id("double-click"));
		ac.doubleClick(ele).build().perform();
		//div-double-click double  --- expected class attribute after double click
		String expectedClass = ele.getAttribute("class");
		Assert.assertEquals(expectedClass, "div-double-click double");
	}
	
	// click-box
	@Test
	public void TestCaseThree() {
		WebElement ele = driver.findElement(By.id("click-box"));
		ac.clickAndHold(ele).build().perform();
		Assert.assertEquals(ele.getText(),"Well done! keep holding that click now.....");
		
	}
	
	@Test
	public void TestCaseFour() {
		WebElement ele = driver.findElement(By.cssSelector("#div-hover > div.dropdown.hover > button"));
		ac.moveToElement(ele).build().perform();
		boolean visible = driver.findElement(By.cssSelector("#div-hover > div.dropdown.hover > div > a")).isDisplayed();
		Assert.assertTrue(visible);
	}
	
	
	@Test
	public void TestCaseFive() {
		
		WebElement ele = driver.findElement(By.cssSelector("#double-click"));
		ac.contextClick(ele).build().perform();
		
		
	}
	
	

	@AfterMethod
	public void closeBroser() {
		//driver.close();
	}
	
	

}
