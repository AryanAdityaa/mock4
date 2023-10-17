package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class homePage {


	@FindBy (xpath = "//span[text()='Home']")
	private WebElement   Home ;
	
	 public homePage  (WebDriver driver) {
			PageFactory.initElements(driver, this);
		}
	
	public void  BackHomePage()
	{
		Home.click();	
	}
}
