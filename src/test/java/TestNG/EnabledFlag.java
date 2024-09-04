package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class EnabledFlag {
	
	@Test(invocationCount = -1)
	public void Demo1() {
		Reporter.log("Demo1",true);
	}
	
	@Test(enabled = false)
	public void Demo2() {
		Reporter.log("Demo2",true);
	}
	
	@Test
	public void Demo3() {
		
		Reporter.log("Demo3",true);
	}

}
