package Actions;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice {
public static void main(String[] args) throws InterruptedException, IOException, AWTException {
	
   WebDriver driver = new ChromeDriver();
   driver.manage().window().maximize();
   driver.get("https://www.ebay.com/");
   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
   
   driver.findElement(By.className("gh-sb"));
   List<WebElement> options = driver.findElements(By.tagName("option"));
   
   Robot chitti = new Robot();
   for (WebElement opt : options) {
	   if(opt.getText().equals("DVDs & Movies"));
	    chitti.keyPress(KeyEvent.VK_ENTER);
	    chitti.keyRelease(KeyEvent.VK_ENTER);
	    break;
      }
        chitti.keyPress(KeyEvent.VK_DOWN);
        chitti.keyRelease(KeyEvent.VK_DOWN);
        
        driver.quit();
        System.out.println("Test Pass");
   
  }
 }


