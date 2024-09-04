package POMclass;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class skillraryTest {
public static void main(String[] args) throws InterruptedException {
	
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demoapp.skillrary.com/");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
	skillraryPage vamshi = new skillraryPage(driver);
	
	vamshi.clickSignupLink();
	vamshi.setFirstname("dimakh thoda");
	vamshi.setLastname("chala teda");
	vamshi.setEmail("Pagal@gmail.com");
	vamshi.setConfirmPWD("Vamshi@420");
	vamshi.setConfirmPWD("Vamshi@420");
	vamshi.clickRegister();
	
	Thread.sleep(3000);
	driver.quit();
	
	System.out.println("Test Pass");
 }
}
