package ListenersPractice;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(ListenersPractice.PracticeListenersImplementation.class)
public class PracticeTestClass extends PracticeBaseClass{
	
	@Test
	public void testMethod() {
		System.err.println("Test");
	}
}
