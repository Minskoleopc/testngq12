package testng;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class test3 {

	
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("I will run before every method");
	}
	

	@AfterMethod
	public void afterMethod() {
		System.out.println("I will run after every method");
	}
	
	@Test(priority =2)
	public void Testcase1() {
		System.out.println("Test case one");
	}
	
	@Test(priority = 1)
	public void Testcase2() {
		System.out.println("Test case two");
	}
	
	@Test(priority = 0)
	public void Testcase3() {
		System.out.println("Test case three");
	}
	
	@Test(priority = -1)
	public void Testcase4() {
		System.out.println("Test case four");
	}
	
	@Test(priority = -2)
	public void five() {
		System.out.println("Test case  five");
	}
	
	@Test(priority = -2)
	public void six() {
		System.out.println("Test case six");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
