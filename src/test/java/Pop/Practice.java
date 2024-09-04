package Pop;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice {
public static void main(String[] args) throws InterruptedException {
	
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.facebook.com/");
	
	driver.findElement(By.name("email")).sendKeys("vamshipanakanti@gmail.com");
	driver.findElement(By.id("pass")).sendKeys("vamshi 8522");
	driver.findElement(By.name("login")).click();
	Thread.sleep(3000);
	
	driver.switchTo().newWindow(WindowType.TAB);
	driver.get("https://www.flipkart.com/");
	driver.findElement(By.className("Pke_EE")).sendKeys("Cricket Kit");
	driver.findElement(By.className("_2iLD__")).click();
	Thread.sleep(3000);
	
	driver.switchTo().newWindow(WindowType.TAB);
	driver.get("https://www.amazon.in/");
	driver.findElement(By.id("twotabsearchtextbox")).sendKeys("cricket kit");
	driver.findElement(By.id("nav-search-submit-button")).click();
	Thread.sleep(3000);
	
	driver.switchTo().newWindow(WindowType.TAB);
	driver.get("https://www.makemytrip.com/");
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
