package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class InvocationCount {

	@Test(invocationCount = 2)
	public void Demo1() {
		Reporter.log("Demo1",true);
	}
	
	@Test(invocationCount = 0)
	public void Demo2() {
		Reporter.log("Demo2",true);
	}
	
	@Test
	public void Demo3() {
		Reporter.log("Demo3",true);
	}
	
	@Test(invocationCount = -2)
	public void Demo4() {
		Reporter.log("Demo4",true);
	}
	
}
