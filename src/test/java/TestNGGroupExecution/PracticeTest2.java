package TestNGGroupExecution;

import org.testng.annotations.Test;

public class PracticeTest2 {
	
	@Test(groups = "Regression")
	public void test1() {
		System.out.println("Test2 -test1 -regression");
	}
	
	@Test(groups = "Sanity")
	public void test2() {
		System.out.println("Test2 -test2 -Sanity");
	}
	
	@Test(groups = {"Regression","Sanity"})
	public void test3() {
		System.out.println("Test2 -test3 -Regression and Sanity");
	}

}
