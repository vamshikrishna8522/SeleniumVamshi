package DropDown;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Practice {
public static void main(String[] args) throws InterruptedException {
	
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.amazon.in/");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
	WebElement dropdown = driver.findElement(By.id("searchDropdownBox"));
	Select select = new Select(dropdown);
	select.selectByIndex(2);
	select.selectByValue("search-alias=fashion");
	select.selectByVisibleText("Amazon Pharmacy");
	
	List<WebElement> options = select.getOptions();
	for (WebElement e: options) {
		System.out.println(e.getText());
	}
	if (select.isMultiple()) {
		System.out.println("Multiple options");
	}
	else {
		System.out.println("Single");
	}
	driver.quit();
  }
}
