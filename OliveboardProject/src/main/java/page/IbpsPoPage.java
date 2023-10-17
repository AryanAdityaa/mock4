package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class IbpsPoPage {

	@FindBy (xpath = "//p[text()='IBPS PO']")
	private WebElement clickIbpsPO ;
	
	
	 public  IbpsPoPage  (WebDriver driver) {
			PageFactory.initElements(driver, this);
		}
	
	 public void  HomeClickIbpspo ()
	{
		 clickIbpsPO.click();
	}
}
