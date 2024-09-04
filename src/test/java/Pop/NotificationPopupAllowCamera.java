package Pop;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class NotificationPopupAllowCamera {
public static void main(String[] args) throws InterruptedException {
	
	ChromeOptions option = new ChromeOptions();
	option.addArguments("--use-fake-ui-for-media-stream");
	
	WebDriver driver = new ChromeDriver(option);
	driver.manage().window().maximize();
	driver.get("https://webcamtests.com/");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
	Thread.sleep(6000);
	driver.quit();
	
	System.out.println("Test Pass");
 }
}
