package Pop;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUploadUsingSendkeys {
public static void main(String[] args) throws InterruptedException {
	
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://the-internet.herokuapp.com/upload");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
	driver.findElement(By.id("file-upload")).sendKeys("C:\\Users\\MSI\\Desktop\\My Resume\\updated resume pdf 1.pdf");
	Thread.sleep(4000);
	driver.quit();
	System.out.println("Test Pass");
  }
}
