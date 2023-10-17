package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SaltExamPage {

	@FindBy (xpath = "//p[text()='SLAT']")
	private WebElement   clickSalt ;
	
	 public  SaltExamPage (WebDriver driver) {
			PageFactory.initElements(driver, this);
		}
	
	public void  clickOnSalt()
	{
		clickSalt.click();	
	}
}
