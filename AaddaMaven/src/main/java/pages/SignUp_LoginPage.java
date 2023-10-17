package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignUp_LoginPage {
	// variable Private
	
	@FindBy (xpath = "//div[text()='Signup/Login']")
	private WebElement SignUpLogin;
	
	@FindBy (xpath = "//input[@data-testid='email-input-box']")
	private WebElement EnterYourMail;
	
	@FindBy (xpath = "//input[@data-testid='password-input-box']")
	private WebElement Password;
	
	@FindBy (xpath = "//span[text()='LOGIN']")
	private WebElement LoginButton  ;
	//////////////////////////////////////////////////////////////////////////////////////////
	//CONSTRUCTOR   PUBLIC
	public SignUp_LoginPage (WebDriver driver) 
	{
		          //TO FIND ELEMENTS
		PageFactory.initElements(driver, this);
	}
	/////////////////////////////////////////////////////////////////////////////////////////
	// METHOD -- PUBLIC
	
	public void SignUpLoginclick() {
		SignUpLogin.click();
	}
	
	public void sendYourMail() {
		EnterYourMail.sendKeys("adityaaryan7079752131@gmail.com");
	}
	
	public void sendYourPassword() {
		Password.sendKeys("aditya9101");
	}
	
	public void clickOnLoginButton() {
		LoginButton.click();
	}
	
}
