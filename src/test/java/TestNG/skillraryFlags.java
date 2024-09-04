package TestNG;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class skillraryFlags {
	
	@Test
	public void navigateToApp() throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapp.skillrary.com/login.php?type=login");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		Thread.sleep(3000);
		driver.quit();
		System.out.println("Navigated Successfully");
	}
	@Test(dependsOnMethods = "navigateToApp")
	public void loginToApp() throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapp.skillrary.com/login.php?type=login");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.id("email")).sendKeys("Admin");
		driver.findElement(By.id("password")).sendKeys("admin123");
		driver.findElement(By.id("last")).click();
		
		Thread.sleep(3000);
		driver.quit();
		System.out.println("Successfully Loggedin");
	}
	
   	
}
