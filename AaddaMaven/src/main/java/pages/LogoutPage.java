package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogoutPage {

	@FindBy (xpath = "//a[text()='Logout']")
	private WebElement LogoutTheApplication ;
	
	public LogoutPage  (WebDriver driver) 
	{	         
		PageFactory.initElements(driver, this);
	}
	
	public void   ApplicationLogoutClick () 
	{
		LogoutTheApplication.click();
	}
}
