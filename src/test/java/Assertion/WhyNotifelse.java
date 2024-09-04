package Assertion;

import org.testng.annotations.Test;

public class WhyNotifelse {
	
	@Test
	public void Demo() {
		String s1 = "hi";
		String s2 = "Hi";
	
	if(s1.equals(s2))
		System.out.println("Pass");
	else
		System.out.println("Fail");
	}
}
