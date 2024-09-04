package CrossBrowserParallel;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Test2 extends BaseClass{
	
	@Test
	public void primeVideotest() {
		driver.get("https://www.primevideo.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement header = driver.findElement(By.xpath("//h1[text()='Welcome to Prime Video']"));
		if(header.isDisplayed())
			System.out.println("Prime Video Pass");
		else
			System.out.println("Prime Video fail");
	}
}
