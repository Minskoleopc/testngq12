package testNg3;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class day2b {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver ;
		System.setProperty("webdriver.chrome.driver", "C://Users//Lenovo//Desktop//chromedriver//chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://www.webdriveruniversity.com/");
		
		String expectedTitle = "WebDriverUniversity.com";
		String actualTitle = driver.getTitle();
		if(actualTitle.equals(expectedTitle)) {
			System.out.println("Testcase pass");
		}
		else {
			System.out.println("Testcase fail");
		}
		
		String currentUrl = driver.getCurrentUrl();
		if(currentUrl.contains("university")) {
			System.out.println("Test case pass");
		}
		else {
			System.out.println("Testcase fail");
		}
		
	
	}

}
