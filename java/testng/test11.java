package testng;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class test11 {
	@Parameters({"browser","username","password"})
	@Test
	public void TestcaseOne(String bw,String un , String pwd) {
		System.out.println("Test case one pass");
		System.out.println(bw);
		System.out.println(un);
		System.out.println(pwd);
	}

	@Test
	public void TestcaseTwo() {
		System.out.println("Test case two pass");
	}
	@Test
	public void TestcaseThree() {
		System.out.println("Test case three pass");
	}
}
