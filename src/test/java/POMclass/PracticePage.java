package POMclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PracticePage {
	
  @FindBy(xpath = "//a[text()='SIGNUP']")
  private WebElement SignupLink;
  
  @FindBy(id="registerClick")
  private WebElement Register;
  
  @FindBy(xpath = "//input[@placeholder='First Name']")
  private WebElement FirstnameTF;
  
  @FindBy(xpath = "//input[@placeholder='Last Name']")
  private WebElement LastnameTF;
  
  @FindBy(xpath = "(//input[@placeholder='Email'])[2]")
  private WebElement EmailTF;
  
  @FindBy(xpath = "(//input[@placeholder='Password'])[2]")
  private WebElement PasswordTF;
  
  @FindBy(xpath = "//input[@placeholder='Confirm Password']")
  private WebElement ConfirmPasswordTF;
  
  @FindBy(partialLinkText = "membership")
  private WebElement AlreadyHaveACLink;
  
  @FindBy(xpath = "//a[text()=' Home']")
  private WebElement HomeLink;
  
  @FindBy(xpath = "//input[@name='signup']")
  private WebElement RegisterBTN;
  
  public PracticePage(WebDriver driver) {
	  PageFactory.initElements(driver,this);
  }
  
  public void clickSignupLink() {
	  SignupLink.click();
  }
  
  public void clickRegister() {
	  Register.click();
  }
  
  public void setFirstname(String Firstname) {
	  FirstnameTF.sendKeys(Firstname);
  }
  
  public void setLastname(String Lastname) {
	  LastnameTF.sendKeys(Lastname);
  }
  
  public void setEmail(String Email) {
	  EmailTF.sendKeys(Email);
  }
  
  public void setPassword(String PWD) {
	  PasswordTF.sendKeys(PWD);
  }
  
  public void setConfirmPassword(String CPWD) {
	  ConfirmPasswordTF.sendKeys(CPWD);
  }
  
  public void clickAlreadyHaveAC() {
	  AlreadyHaveACLink.click();
  }
  
  public void clickHomeLink() {
	  HomeLink.click();
  }
  
  public void clickRegisterBTN() {
	  RegisterBTN.click();
  }
  
	
}
