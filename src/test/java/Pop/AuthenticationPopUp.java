package Pop;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AuthenticationPopUp {
public static void main(String[] args) throws InterruptedException {
	
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://admin:admin@the-internet.herokuapp.com/");
	Thread.sleep(3000);
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
	String text=driver.findElement(By.tagName("p")).getText();
	Thread.sleep(3000);
	System.out.println(text);
	driver.quit();
	
 }
}
