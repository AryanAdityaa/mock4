package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

	@FindBy (xpath = "//a[@id='nav-logo-sprites']")
	private WebElement clickAmazon;
	
	
	public   HomePage (WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void BackToAmazonHomePage() 
	{
		clickAmazon.click();
	}
}
