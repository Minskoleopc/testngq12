
package testng;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

@Ignore
public class test11e {
	
	@Test(priority = 1)
	public void TestThree() {
		System.out.println("Test case three pass");
	}
	
	@Ignore
	@Test(priority = 2)
	public void TestFour() {
		System.out.println("Test case four pass");
	}
	@Test(priority = 3)
	public void TestFive() {
		System.out.println("Test case five pass");
	}

}
