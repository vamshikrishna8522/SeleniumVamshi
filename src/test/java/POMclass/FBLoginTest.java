package POMclass;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FBLoginTest {
public static void main(String[] args) throws InterruptedException {
	
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.facebook.com/");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
	FBLoginPage login = new FBLoginPage(driver);
	login.setEmail("vamshipanakanti@gmail.com");
	login.setPassword("vamshi 8522");
	login.clickLogin();
	
	Thread.sleep(3000);
	driver.quit();
	
	System.out.println("test Pass");
	
  }
}
