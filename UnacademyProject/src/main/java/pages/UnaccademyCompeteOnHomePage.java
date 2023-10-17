package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UnaccademyCompeteOnHomePage {

	@FindBy (xpath = "(//a[@class=' e2khoyd1 css-ne1rkr-Link-Item e1l00lnb0'])[1]")
	private WebElement CompeteOnHomePage ;
	
	@FindBy (xpath = "//span[@class='p2_variant aquilla-typography typography css-nr7oa0']")
	private WebElement AllStateOption ;
	
	@FindBy (xpath = "//p[text()='Bihar']")
	private WebElement SelectBiharOnDropElement ;
	
	
					public UnaccademyCompeteOnHomePage  (WebDriver driver) 
					{
						          //TO FIND ELEMENTS
						PageFactory.initElements(driver, this);
					}
					
	public void ClickCompeteOnHomePage ()
	{
		CompeteOnHomePage.click();
	}
	
	public void clickAllState() 
	{
		 AllStateOption.click();
	}
	
	public void  selectingOneStateFromOptions() 
	{
		SelectBiharOnDropElement.click();
	}
	
	
	
	
	
	
	
	
	
	
	
}
