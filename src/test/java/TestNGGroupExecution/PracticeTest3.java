package TestNGGroupExecution;

import org.testng.annotations.Test;

public class PracticeTest3 {
	
	@Test(groups = "Smoke")
	public void test1() {
		System.out.println("Test3 -test1 -Smoke");
	}
	
	@Test(groups = "Regression")
	public void test2() {
		System.out.println("Test3 -test2 Regression");
	}
	
	@Test(groups = {"Smoke","Regression"})
	public void test3() {
		System.out.println("Test3 -test3 -Smoke and Regression");
	}

}
