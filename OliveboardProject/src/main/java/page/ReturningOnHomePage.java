package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ReturningOnHomePage {

	@FindBy (xpath = "")
    private WebElement ReturningToHomePage;
    
    public  ReturningOnHomePage (WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
    
    
    public void HomePageReturnFromAnyWhere()
	{
    	ReturningToHomePage.click();
	}
}
