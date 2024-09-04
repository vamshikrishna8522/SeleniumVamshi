package TestNGGroupExecution;

import org.testng.annotations.Test;

public class Test2 {
	
	@Test(groups = "Regression")
	public void test1() {
		System.out.println("Test2 -test1 -Regression");
	}
	
	@Test(groups = "Sanity")
	public void tes2() {
		System.out.println("Test2 -test2 -Sanity");
	}
	
	@Test(groups = {"Smoke","sanity"})
	public void test3() {
		System.out.println("Test2 -test3 -Regression and Sanity");
	}
}
