package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BuyNewProductOnNewRelease {

	@FindBy (xpath = "//a[text()='New Releases']")
	private WebElement BuyTheProductOnNewRelease;
	
	
	public   BuyNewProductOnNewRelease (WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void NewRelaseBuyitem() 
	{
		BuyTheProductOnNewRelease.click();
	}
}
