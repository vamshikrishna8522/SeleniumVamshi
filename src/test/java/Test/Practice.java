package Test;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice {
public static void main(String[] args) throws InterruptedException, IOException {
	
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.swiggy.com/");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	Thread.sleep(3000);
	
	WebElement swiggy = driver.findElement(By.xpath("//div[@class='nDVxx']"));
	File src = swiggy.getScreenshotAs(OutputType.FILE);
	File dest = new File("./Screenshot/swiggy.png");
	FileUtils.copyFile(src, dest);
	
	driver.quit();
	System.out.println("Test Pass");
 }
}
