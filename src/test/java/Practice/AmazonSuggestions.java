package Practice;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonSuggestions {
public static void main(String[] args) {
	
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.amazon.in/");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
	driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Chocolates");
	List<WebElement> choco = driver.findElements(By.xpath("//div[text()='chocolates']"));
	for (WebElement e : choco) {
		System.out.println(e.getText());
	}
	  driver.quit();
	  System.out.println("Test Pass");
 }
}
