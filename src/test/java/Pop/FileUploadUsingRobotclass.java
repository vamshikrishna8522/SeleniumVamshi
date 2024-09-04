package Pop;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUploadUsingRobotclass {
public static void main(String[] args) throws AWTException, InterruptedException {
	
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.naukri.com/registration/createAccount?othersrcp=23531");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
	driver.findElement(By.id("name")).sendKeys("ABCD");
	driver.findElement(By.id("email")).sendKeys("abc_xyz_987@gmail.com");
	driver.findElement(By.id("password")).sendKeys("abcxyz@123987");
	driver.findElement(By.id("mobile")).sendKeys("7729096567");
	driver.findElement(By.xpath("//h2[text()=\"I'm experienced\"]")).click();
	driver.findElement(By.xpath("//button[text()='Upload Resume']")).click();
	
	StringSelection str = new StringSelection("C:\\Users\\MSI\\Documents\\Shiva Kumar Resume.pdf");
	Toolkit.getDefaultToolkit().getSystemClipboard().setContents(str, null);
	Thread.sleep(3000);
	
	Robot r = new Robot();
	r.keyPress(KeyEvent.VK_CONTROL);
	r.keyPress(KeyEvent.VK_V);
	
	r.keyRelease(KeyEvent.VK_CONTROL);
	r.keyRelease(KeyEvent.VK_V);
	
	r.keyPress(KeyEvent.VK_ENTER);
	r.keyRelease(KeyEvent.VK_ENTER);
	
	Thread.sleep(3000);
	driver.quit();
	
	System.out.println("Test pass");
  }
}
