package Test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Rightclick {
public static void main(String[] args) throws InterruptedException {
	
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demoapps.qspiders.com/ui/button/buttonRight?sublist=1");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
	WebElement rightclick = driver.findElement(By.id("btn30"));
	Actions action = new Actions(driver);
	action.contextClick(rightclick).perform();
    driver.findElement(By.xpath("//div[text()='Yes']")).click();
    Thread.sleep(3000);
    driver.quit();
    System.out.println("Test Pass");
	
	
	
	
	
}

}
