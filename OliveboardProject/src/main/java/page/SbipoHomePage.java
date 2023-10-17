package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SbipoHomePage {

	@FindBy (xpath = "//p[text()='SBI PO']")
	private WebElement SbiPoOnHomePage ;
	
	public  SbipoHomePage (WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	
	public void clickOnSbiPoOnHomePage()
	{
		SbiPoOnHomePage.click();
	}
	
}
