package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EbookBuyOptionPage {

	@FindBy (xpath = "(//a[text()=' Buy now'])[1]")
	private WebElement BuyOption ; 
	
	@FindBy (xpath = "(//span[text()='REMOVE'])[1]")
	private WebElement removeCoupon ;
	
	@FindBy (xpath = "(//span[text()='Continue'])[1]")
	private WebElement clickContinue ;
	
	@FindBy (xpath = "//input[@id='name']")
	private WebElement SendName ;
	
	@FindBy (xpath = "//input[@id='phone']")
	private WebElement SendPhoneNumber ;
	
	@FindBy (xpath = "//input[@id='email']")
	private WebElement SendEmailAddress ;
	
	@FindBy (xpath = "(//span[text()='Continue'])[1]")
	private WebElement ClickContinue ;
	
	public EbookBuyOptionPage (WebDriver driver) 
	{
		         
		PageFactory.initElements(driver, this);
	}
	
	
	
	public void  SpecificProuctSelection () 
	{
		BuyOption.click();
	}
	public void  CouponRemoveAndThenSelect () 
	{
		removeCoupon.click();
	}
	public void  continueToBuy () 
	{
		clickContinue.click();
	}
	
	public void  FeedName () 
	{
		SendName.sendKeys("aditya");
	}
	public void  FeedMobileNumber () 
	{
		SendPhoneNumber.sendKeys("8887878878");
	}
	public void  FeedEmailAddress () 
	{
		SendEmailAddress.sendKeys("aditya.aryan142@gmail.com");
	}
	public void  ContinueClick () 
	{
		ClickContinue.click();
	}
	
	
	
}
