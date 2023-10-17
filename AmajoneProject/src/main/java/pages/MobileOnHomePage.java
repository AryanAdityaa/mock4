package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MobileOnHomePage {
	
	@FindBy (xpath = "//a[text()='Mobiles']")
	private WebElement MobileTabOnHomePage;
	
	@FindBy (xpath = "//span[text()='Mobile Broadband Devices']")
	private WebElement BroadbandOnMobilePage;
	
	@FindBy (xpath = "(//span[@class='a-size-base a-color-base'])[70]")
	private WebElement BroadbandProduct;
	
	
	public   MobileOnHomePage (WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void MobileOnHomePageClick() 
	{
		MobileTabOnHomePage.click();
	}
	public void BroadbandOnMobilePage() 
	{
		BroadbandOnMobilePage.click();
	}
	public void BroadbandSpecificProduct() 
	{
		BroadbandProduct.click();
	}
}
