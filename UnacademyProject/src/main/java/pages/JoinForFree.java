package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class JoinForFree {

	@FindBy ( xpath = "//span[text()='Join for free']")
	private WebElement JoinForFree;
	
	
	@FindBy (xpath = "//input[@placeholder='Enter your mobile number']")
	private WebElement MobileNumber;
	
	@FindBy (xpath = "//button[text()='Continue']")
	private WebElement Continue ;
	
	public  JoinForFree (WebDriver driver) 
	{
		          //TO FIND ELEMENTS
		PageFactory.initElements(driver, this);
	}
	
	
	public void ClickCompeteOnHomePage ()
	{
		JoinForFree.click();
	}
	
	
	public void sendMobileNumber()
	{
		MobileNumber.sendKeys("7879684584");
	}
	
	public void ClickContinue()
	{
		Continue.click();
	}
	
}
