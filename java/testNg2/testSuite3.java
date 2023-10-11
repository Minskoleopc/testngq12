package testNg2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class testSuite3 {

	WebDriver driver ;
	@Test
	public void TestcaseOne() {
		// Auto suggestive drop down testcase one
		// http://www.webdriveruniversity.com/Autocomplete-TextField/autocomplete-textfield.html
		System.setProperty("webdriver.chrome.driver", "C://Users//Lenovo//Desktop//chromedriver//chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://www.webdriveruniversity.com/Autocomplete-TextField/autocomplete-textfield.html");
		WebElement inpute = driver.findElement(By.id("myInput"));
		inpute.sendKeys("p");
		List <WebElement> inputs = driver.findElements(By.cssSelector("#myInputautocomplete-list >div"));
		for(int i = 0 ; i < inputs.size(); i++) {
			//System.out.println(i);
			String options = inputs.get(i).getText();
			System.out.println(options);
			if(options.equals("Pancakes")) {
				inputs.get(i).click();
				break;
			}
		}
		driver.findElement(By.cssSelector("#submit-button")).click();
		String urlText = driver.getCurrentUrl();
		boolean avail = urlText.contains("Pancakes");
		Assert.assertTrue(avail);
		driver.close();
		
	}
	

	@Test
	public void TestcaseTwo() {
		// Auto suggestive drop down testcase two
		// Select the first value without looping through the list
		System.setProperty("webdriver.chrome.driver", "C://Users//Lenovo//Desktop//chromedriver//chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://www.webdriveruniversity.com/Autocomplete-TextField/autocomplete-textfield.html");
		WebElement inpute = driver.findElement(By.id("myInput"));
		inpute.sendKeys("p");
		inpute.sendKeys(Keys.ARROW_DOWN);
		inpute.sendKeys(Keys.ENTER);
		driver.findElement(By.cssSelector("#submit-button")).click();
		String urlText = driver.getCurrentUrl(); // Pizza
		boolean avail = urlText.contains("Pizza");
		Assert.assertTrue(avail);
		driver.close();
		
		
		
		
		
	}
}
