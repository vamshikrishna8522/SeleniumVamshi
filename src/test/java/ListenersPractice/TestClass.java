
package ListenersPractice;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(ListenersPractice.ListenersImplementation.class)
public class TestClass extends BaseClass {

	@Test
	public void testMethod() {
		System.out.println("Test");
	}
}
