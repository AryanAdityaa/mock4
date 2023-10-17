package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogoutPage {

	@FindBy (xpath = "//span[text()='More']")
	private WebElement   More ;
	
	@FindBy (xpath = "//span[text()='Log out']")
	private WebElement  Logout ;
	
	 public  LogoutPage  (WebDriver driver) {
			PageFactory.initElements(driver, this);
		}
	
	public void  clickMore()
	{
		More.click();	
	}
	
	public void  clickLogout()
	{
		Logout.click();	
	}
	
	
	
	
	
	
	
	
	//span[text()='Log out']
	//span[text()='More']
	
	
	
	
}
