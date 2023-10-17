package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GOToProfilePage {

	@FindBy (xpath = "//span[text()='Profile']")
	private WebElement   ProfileTab ;
	
	
	 public  GOToProfilePage  (WebDriver driver) {
			PageFactory.initElements(driver, this);
		}
	
	public void  GoToProfile()
	{
		ProfileTab.click();
	}
}
