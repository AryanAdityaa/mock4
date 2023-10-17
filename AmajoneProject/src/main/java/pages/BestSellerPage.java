package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BestSellerPage {

	@FindBy (xpath = "(//a[text()='Best Sellers'])[1]")
	private WebElement BestSellerClick;

	public BestSellerPage (WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void ClickOnBestSellerPage() 
	{
		BestSellerClick.click();
	}
}
