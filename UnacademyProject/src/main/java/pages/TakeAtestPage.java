package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TakeAtestPage {

	@FindBy (xpath = "//button[text()='Take test']")
	private WebElement  ClickTakeATest;
	
	
	public TakeAtestPage  (WebDriver driver) 
	{
		          //TO FIND ELEMENTS
		PageFactory.initElements(driver, this);
	}
	
	public void  ClickOnTakeATest ()
	{
		ClickTakeATest.click();
	}
}
