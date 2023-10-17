package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignInOrLogin {

	@FindBy (xpath = "//input[@aria-label='Phone number, username, or email']")
	private WebElement   UserEmailOrName;
	
	
	@FindBy (xpath = "//input[@aria-label='Password']")
	private WebElement   UserPassword ;
	
	@FindBy (xpath = "//div[text()='Log in']")
	private WebElement   login ;
	
	
	 public  SignInOrLogin  (WebDriver driver) {
			PageFactory.initElements(driver, this);
		}
	
	public void  sendUserName()
	{
		UserEmailOrName.sendKeys("soft_waretest");	
	}
	public void  sendPassword ()
	{
		UserPassword.sendKeys("software");	
	}
	public void  login ()
	{
		login.click();	
	}
}
