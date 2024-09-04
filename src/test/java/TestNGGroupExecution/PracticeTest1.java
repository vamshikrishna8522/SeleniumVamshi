package TestNGGroupExecution;

import org.testng.annotations.Test;

public class PracticeTest1 {
	
	@Test(groups = "Smoke")
	public void test1() {
		System.out.println("Test1 -test1 -Smoke");
	}
	
	@Test(groups = "Sanity")
	public void test2() {
		System.out.println("Test1 -test2 -Sanity");
	}
	
	@Test(groups = {"Smoke","Regression"})
	public void test3() {
		System.out.println("Test1 -test3 -Smoke and Sanity");
	}

}
