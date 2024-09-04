package POMclass;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PracticeTest {
public static void main(String[] args) throws InterruptedException {
	
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demoapp.skillrary.com/login.php?type=register");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
	PracticePage vamshi = new PracticePage(driver);
	
	vamshi.clickSignupLink();
	vamshi.clickRegister();
	vamshi.setFirstname("Dimakh Thoda");
	vamshi.setLastname("Chala Theda");
	vamshi.setEmail("pagal420@gmail.com");
	vamshi.setPassword("vamshi@420");
	vamshi.setConfirmPassword("vamshi@420");
	vamshi.clickRegisterBTN();
	
	Thread.sleep(3000);
	driver.quit();
	
	System.out.println("Test Pass");
	
  }
}
