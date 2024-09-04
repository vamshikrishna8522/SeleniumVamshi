package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestNGPractice {
	
	@Test(priority = 2)
	public void Demo() {
		Reporter.log("Demo");
	}
	@Test(priority = -2)
	public void Demo1() {
		Reporter.log("Demo1");
	}
	@Test(priority = 0)
	public void Demo2() {
		Reporter.log("Demo2");
	}
	@Test
	public void Demo3() {
		Reporter.log("Demo3");
	}
	@Test(priority = 2)
	public void Demo4() {
		Reporter.log("Demo4");
	}
	@Test
	public void Demo5() {
		Reporter.log("Demo5");
	}
	

}
