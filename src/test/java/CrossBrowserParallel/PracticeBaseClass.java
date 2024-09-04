package CrossBrowserParallel;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;


public class PracticeBaseClass {

	WebDriver driver;
	@Parameters("BROWSER")
	@BeforeClass
	public void classConfig(String browser) {
		if(browser.equalsIgnoreCase("chrome")) {
			driver = new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			System.out.println("Chrome");
		}
		else if (browser.equalsIgnoreCase("firefox")) {
			driver = new FirefoxDriver();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			System.out.println("Firefox");
		}
		else if (browser.equalsIgnoreCase("firefox")) {
			driver = new FirefoxDriver();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			System.out.println("Firefox");
		}
		else if (browser.equalsIgnoreCase("edge")) {
			driver = new EdgeDriver();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			System.out.println("Edge");
		}
	   }
	    @AfterClass
		public void classDeConfig() {
	    	driver.quit();
			
	}
}


