package popUp;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Practice {
public static void main(String[] args) throws InterruptedException {
	
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.snapdeal.com/");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
	WebElement signin = driver.findElement(By.xpath("//span[text()='Sign In']"));
	Actions action = new Actions(driver);
	action.moveToElement(signin).perform();
	
	driver.findElement(By.xpath("//a[text()='login']")).click();
	Thread.sleep(3000);
	driver.switchTo().frame("loginIframe");
	driver.findElement(By.id("close-pop")).click();
	driver.switchTo().defaultContent();
	
	driver.findElement(By.id("inputValEnter")).sendKeys("Cricket Kit");
	driver.findElement(By.className("searchformButton")).click();
	Thread.sleep(3000);
	
	driver.quit();
	System.out.println("Test Pass");
}

}
