package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FooterPage {

	@FindBy (xpath = "//a[text()='careers']")
	private WebElement  clickCareer ;
	
	@FindBy (xpath = "//a[text()='media']")
	private WebElement clickMedia ;
	
	@FindBy (xpath = "//a[text()='careers for faculties']")
	private WebElement  ClickCareerForFaculties ;
	
	@FindBy (xpath = "//a[text()='content partner']")
	private WebElement ClickContentPartner ;
	
	@FindBy (xpath = "//a[text()='ebooks']")
	private WebElement clickEbook ;
	
	@FindBy (xpath = "	//a[text()='GATE Online Coaching']")
	private WebElement  clickGateOnlineCoaching ;
	
	
	public  FooterPage (WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
	}
	
	public void CareerOptions () 
	{
		clickCareer.click();
	}
	public void MediaOptions () 
	{
		clickMedia.click();
	}
	public void CareerForOppurtunityOptions () 
	{
		ClickCareerForFaculties.click();
	}
	public void ContentPartnerOptions () 
	{
		ClickContentPartner.click();
	}
	public void EbookOptions () 
	{
		clickEbook.click();
	}
	public void GetOnlineCoachingOptions () 
	{
		clickGateOnlineCoaching.click();
	}
	
}
