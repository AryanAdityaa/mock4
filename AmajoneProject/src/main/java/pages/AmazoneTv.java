package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AmazoneTv {
	
	@FindBy (xpath = "//a[text()='Amazon miniTV']")
	private WebElement AmazonTvOnHomePage;
	
	@FindBy (xpath = "//span[text()='Web Series']")
	private WebElement WebSeries;
	
	@FindBy (xpath = "//img[@data-testid='appnavbar_menuitem_mshopicon']")
	private WebElement Show;
	
	
	public AmazoneTv (WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void AmazoneTvOnHomePage() 
	{
		 AmazonTvOnHomePage.click();
	}
	public void WebSeriesOnAmazon() 
	{
		WebSeries.click();
	}
	public void ShowInTheWebseries() 
	{
		Show.click();
	}
}
 