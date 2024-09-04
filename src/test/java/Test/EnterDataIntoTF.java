package Test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class EnterDataIntoTF {
public static void main(String[] args) throws InterruptedException {
	
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demoapps.qspiders.com/ui/button?sublist=0");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
	driver.findElement(By.id("btn")).click();
	String yes = driver.findElement(By.xpath("//button[@id='btn']")).getText();
	if(yes.contains(yes)) {
		System.out.println("Matched");
	}
	else {
		System.out.println("MisMatched");
	}
	driver.quit();
 }
}
