package TestNGGroupExecution;

import org.testng.annotations.Test;

public class Test4 {
	
	@Test
	public void test1() {
		System.out.println("Test4 -test1 -NoGroup");
	}
	
	@Test(groups = {"Smoke","Sanity","Regression"})
	public void test2() {
		System.out.println("Test4 -test2 - Smoke,Sanity and Regression");
	}

}
