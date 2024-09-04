package DropDown;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class dropdown {
public static void main(String[] args) throws InterruptedException {
	
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.amazon.in/");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
	WebElement allDropdown = driver.findElement(By.id("searchDropdownBox"));
	Select select = new Select(allDropdown);
	select.selectByIndex(8);
	Thread.sleep(3000);
	select.selectByValue("search-alias=stripbooks");
	Thread.sleep(3000);
	select.selectByVisibleText("Clothing & Accessories");
	Thread.sleep(3000);
	
	
	List<WebElement> options = select.getOptions();
	for(WebElement opt : options) {
		System.out.println(opt.getText());
	}
	
	if(select.isMultiple()) {
		System.out.println("Multiple");
	}
	else {
		System.out.println("sinlge");
	}
	
	driver.quit();
	
	
	
	
	
	
	
	
}

}
