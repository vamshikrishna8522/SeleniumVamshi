package CrossBrowserParallel;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

public class BaseClass {
	
	WebDriver driver;
	@Parameters("BROWSER")
	@BeforeClass
    public void classConfig(String browser) {
		if(browser.equalsIgnoreCase("chrome")) {
			driver=new ChromeDriver();
			driver.manage().window().maximize();
			System.out.println("Chrome");
		}
		else if (browser.equalsIgnoreCase("firefox")) {
			driver = new FirefoxDriver();
			driver.manage().window().maximize();
			System.out.println("Firefox");
		}
		else if (browser.equalsIgnoreCase("edge")) {
			driver = new EdgeDriver();
			driver.manage().window().maximize();
			System.out.println("edge"); 
		}
		else {
			System.out.println("Invalid Broeswer Info");
		}	
	}
	
	@AfterClass
	public void classDeconfig() {
		driver.quit();
	}

}
