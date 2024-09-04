package POMclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FBLoginPage {
	
	// Declaration
	
	@FindBy(id="email")
	private WebElement emailTF;
	
	@FindBy(id="pass")
	private WebElement pwdTF;
	
	@FindBy(name="login")
	private WebElement loginBTN;
	
	@FindBy(linkText = "Forgotten password?")
	private WebElement forgorPWDLink;
	
	@FindBy(xpath = "/a[text()='Create new account']")
	private WebElement createAccountLink;
	
	// Initialization
	public FBLoginPage(WebDriver driver) {
		PageFactory.initElements(driver,this);
      }
	
	//Utilization
	
	public void setEmail(String email) {
		emailTF.sendKeys(email);
	}
	
	public void setPassword(String pwd) {
		pwdTF.sendKeys(pwd);
	}
	
	public void clickLogin() {
		loginBTN.click();
	}
	
	public void clickForgotPWD() {
		forgorPWDLink.click();
	}
	
	public void clickcreteAccount() {
		createAccountLink.click();
	}
}
