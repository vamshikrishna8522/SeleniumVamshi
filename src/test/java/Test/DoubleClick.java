package Test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClick {
public static void main(String[] args) throws InterruptedException {
	
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demoapps.qspiders.com/ui/button/buttonDouble?sublist=2");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
	WebElement doubleclick = driver.findElement(By.id("btn20"));
	Actions action = new Actions(driver);
	action.doubleClick(doubleclick).perform();
	Thread.sleep(2000);
	driver.quit();
	
	System.out.println("Test Pass");
}

}
