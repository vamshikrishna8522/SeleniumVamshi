package Pop;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenNewWindowAndTabs {
public static void main(String[] args) throws InterruptedException {
	
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.netflix.com/");
	
	driver.switchTo().newWindow(WindowType.TAB);
	driver.get("https://x.com/");
	
	driver.switchTo().newWindow(WindowType.WINDOW);
	driver.get("https://in.bookmyshow.com/");
	
	Thread.sleep(3000);
	driver.quit();
	
 }
}
