package testNg3;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class day3c {	
	
	@BeforeSuite
	public void beforeSuite() {
		System.out.println("Before suite"); // 1
	}
	
	@BeforeTest
	public void beforeTest() {
		System.out.println("Before test"); // 2
	}
	
	@BeforeClass
	public void beforeClass() {
		System.out.println("Before class"); // 3
	}
	
	@BeforeMethod
	public void beforeMethod(){
		System.out.println("i will run before every test case"); // 4 // 7
	}
		
	@Test
	public void TestCaseOne() {
		System.out.println("testcase one pass"); // 5
	}
	@Test
	public void TestCaseTwo() {
		System.out.println("Testcase two pass"); // 8
	}
	
	@AfterMethod
	public void afterMethod() {
		System.out.println("i will run after every test case"); // 6 // 9
	}
	
	@AfterClass // 10
	public void afterClass() {
		System.out.println("after class");
	}
	 
	@AfterTest // 11
	public void afterTest() {
		System.out.println("After test");
	}
	
	@AfterSuite // 12
	public void afterSuite() {
		System.out.println("After suite");
	}
	
	

}
