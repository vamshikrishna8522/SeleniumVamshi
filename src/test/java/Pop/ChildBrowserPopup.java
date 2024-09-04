package Pop;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildBrowserPopup {
public static void main(String[] args) throws InterruptedException {
	
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.flipkart.com/");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
	driver.findElement(By.name("q")).sendKeys("furniture");
	driver.findElement(By.className("_2iLD__")).click();
	
	driver.findElement(By.linkText("FurniGully Shoe Rack accessories, plastic transparent l...")).click();
	Thread.sleep(3000);
	
	Set<String> set = driver.getWindowHandles();
	for (String string : set) {
		driver.switchTo().window(string);
		if(driver.getTitle().contains("FurniGully"))
		 break;
	}
	 Thread.sleep(3000);
	 driver.findElement(By.xpath("//button[text()='Add to cart']")).click();
	 Thread.sleep(3000);
	 driver.close();
	 
	 set = driver.getWindowHandles();
		for (String string : set)
		{
			driver.switchTo().window(string);
			if(driver.getTitle().contains("Furniture"))
			 break;
  }
		Thread.sleep(3000);
		driver.navigate().refresh();
		String text = driver.findElement(By.className("ZuSA--")).getText();
		System.out.println(text);
		driver.quit();
		
		System.out.println("Test Pass");    

 } 
}
