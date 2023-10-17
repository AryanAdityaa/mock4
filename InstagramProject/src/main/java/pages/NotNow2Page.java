package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NotNow2Page {


	@FindBy (xpath = "//button[text()='Not Now']")
	private WebElement   NotNow2 ;
	
	
	 public  NotNow2Page  (WebDriver driver) {
			PageFactory.initElements(driver, this);
		}
	
	public void  NotNow()
	{
		NotNow2.click();	
	}
}
