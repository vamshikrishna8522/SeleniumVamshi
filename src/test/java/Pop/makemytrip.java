package Pop;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class makemytrip {
public static void main(String[] args) throws InterruptedException {
	
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.makemytrip.com/");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
	driver.findElement(By.cssSelector("span.commonModal__close")).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath("//label[@for='departure']")).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath("//div[@aria-label='Mon Sep 02 2024']")).click();
	
	Thread.sleep(3000);
	driver.quit();
	System.out.println("Test Pass");
 }
}
