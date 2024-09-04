package Actions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseOverDoubleClick {
public static void main(String[] args) throws InterruptedException {
	
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demoapp.skillrary.com/");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
	WebElement cource = driver.findElement(By.id("course"));
	Actions actions = new Actions(driver);
	actions.moveToElement(cource).perform();

   
	driver.findElement(By.xpath("//span/a[text()='selenium']")).click();
	WebElement plusBTN = driver.findElement(By.id("add"));
	actions.doubleClick(plusBTN).perform();
	
	Thread.sleep(2000);
	driver.quit();
	
	System.out.println("Test Pass");
	
	
	
	
}


}
