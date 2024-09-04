package POMclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class skillraryPage {
	
	@FindBy(xpath = "//a[text()='SIGNUP']")
	private WebElement SignupLink;
	
	@FindBy(xpath = "//input[@placeholder='First Name']")
	private WebElement FirstnameTF;
	
	@FindBy(xpath = "//input[@placeholder='Last Name']")
	private WebElement LastnameTF;
	
	@FindBy(xpath = "(//input[@name='email']) [2]")
	private WebElement EmailTF;
	
	@FindBy(xpath = "(//input[@placeholder='Password']) [2]")
	private WebElement PasswordTF;
	
	@FindBy(xpath = "//input[@placeholder='Confirm Password']")
	private WebElement ConfirmPasswordTF;
	
	@FindBy(partialLinkText =  "membership")
	private WebElement AlreadyhaveACLink;
	
	@FindBy(xpath = "//a[text()=' Home']")
	private WebElement HomeLink;
	
	@FindBy(xpath = "//input[@name='signup']")
	private WebElement RegisterBTN;
	
	public skillraryPage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
	public void clickSignupLink() {
		SignupLink.click();
	}
	
	public void setFirstname(String FirstName) {
		FirstnameTF.sendKeys(FirstName);
	}
	
	public void setLastname(String LastName) {
		LastnameTF.sendKeys(LastName);
	}
	
	public void setEmail(String Email) {
		EmailTF.sendKeys(Email);
	}
	
	public void setPWD(String PWD) {
		PasswordTF.sendKeys(PWD);
	}
	
	public void setConfirmPWD(String CPWD) {
		ConfirmPasswordTF.sendKeys(CPWD);
	}
	
	public void clickAlreadyAC() {
		AlreadyhaveACLink.click();
	}
	
	public void clickHome() {
		HomeLink.click();
	}
	
	public void clickRegister() {
		RegisterBTN.click();
	}
	
}
