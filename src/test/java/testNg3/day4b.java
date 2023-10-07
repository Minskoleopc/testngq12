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

public class day4b {

	@BeforeSuite
	public void beforeSuite() {
		System.out.println("before suite");
	}
	
	@BeforeTest
	public void beforeTest() {
		System.out.println("Before test");
	}
	
	@BeforeClass
	public void beforeClass() {
		System.out.println("before class");
	}
	
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("Before method");
	}
	
	@Test
	public void TestCaseOne() {
		System.out.println("Testcase one pass");
	}
	
	@Test
	public void TestCaseTwo() {
		System.out.println("Testcase two pass");
	}
	
	@AfterMethod
	public void afterMethod() {
		System.out.println("after method");
	}

	@AfterClass
	public void afterClass() {
		System.out.println("After class");
	}
	
	@AfterTest
	public void afterTest() {
		System.out.println("After test");
	}
	
	@AfterSuite
	public void afterSuite() {
		System.out.println("after suite");
	}
	
}
