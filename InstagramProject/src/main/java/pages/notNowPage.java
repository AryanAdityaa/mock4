package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class notNowPage {

	@FindBy (xpath = "//div[text()='Not Now']")
	private WebElement   NotNow ;
	
	
	 public  notNowPage  (WebDriver driver) {
			PageFactory.initElements(driver, this);
		}
	
	public void  NotNow()
	{
		NotNow.click();	
	}
}
