package Pop;

import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class NotificationPopupYatra {
public static void main(String[] args) throws InterruptedException {
	
	ChromeOptions option = new ChromeOptions();
	option.addArguments("--disable-notifications");
	
	WebDriver driver = new ChromeDriver(option);
	driver.manage().window().maximize();
	driver.get("https://www.yatra.com/");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
	Thread.sleep(3000);
	driver.quit();
	
	System.out.println("Test Pass");
	
  }
}
