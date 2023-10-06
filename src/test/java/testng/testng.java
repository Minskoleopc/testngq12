package testng;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class testng {
	WebDriver driver
;
	@Test
	public void AutoSuggestiveDropDown() {
		System.setProperty("webdriver.chrome.driver", "C://Users//Lenovo//Desktop//chromedriver//chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://www.webdriveruniversity.com/Autocomplete-TextField/autocomplete-textfield.html");
		driver.findElement(By.id("myInput")).sendKeys("p");
		List <WebElement> lista = driver.findElements(By.cssSelector("#myInputautocomplete-list > div"));
		for(int i = 0 ; i < lista.size() ; i++) {
			System.out.println(i);
//			String eleText = lista.get(i).getText();
//			System.out.println(eleText);
			if(lista.get(i).getText().contains("Pancakes")) {
				lista.get(i).click();
				break;
			}
		}
		driver.findElement(By.id("submit-button")).click();
		String  cl =  driver.getCurrentUrl();
		boolean avail = cl.contains("Pancakes");
		Assert.assertTrue(avail);
		driver.close();
		
	}
	
	@Test
	public void AutoSuggestiveDropDownTwo() {
		
		System.setProperty("webdriver.chrome.driver", "C://Users//Lenovo//Desktop//chromedriver//chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://www.webdriveruniversity.com/Autocomplete-TextField/autocomplete-textfield.html");
		WebElement inputE = driver.findElement(By.id("myInput"));
		inputE.sendKeys("P");
		inputE.sendKeys(Keys.ARROW_DOWN);
		inputE.sendKeys(Keys.ENTER);
		driver.findElement(By.id("submit-button")).click();
		String  cl =  driver.getCurrentUrl();
		boolean avail = cl.contains("Pizza");
		Assert.assertTrue(avail);
		driver.close();
	
	}
	
	
	
	
	
	
	
	
	
	
}
