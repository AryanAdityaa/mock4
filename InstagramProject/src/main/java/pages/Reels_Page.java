package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Reels_Page {
 

	@FindBy (xpath = "//span[text()='Reels']")
	private WebElement   Reels ;
	
	
	 public  Reels_Page  (WebDriver driver) {
			PageFactory.initElements(driver, this);
		}
	
	
	public void  ClickReels()
	{
		Reels.click();	
	}
}
