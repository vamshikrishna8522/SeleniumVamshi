package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class PriorityTests {
	
	@Test(priority = 2)
	public void Demo1() {
		Reporter.log("Demo1",true);
	}
	@Test(priority = 2)
	public void Demo2() {
		Reporter.log("Demo2",true);
	}
	@Test
	public void Demo3() {
		Reporter.log("Demo3",true);
	}
	
	@Test(priority = -2)
	public void Demo4() {
		Reporter.log("Demo4",true);
	}
	@Test(priority = -1)
	public void Demo5() {
		Reporter.log("Demo5",true);
	}
	@Test(priority = 0
			
			)
	public void Demo6() {
		Reporter.log("Demo6",true);
	}

}
