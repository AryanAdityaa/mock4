package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BioPage {

	@FindBy (xpath = "//textarea[@class='_ab44']")
	private WebElement   textarea ;
	
	@FindBy (xpath = "//div[text()='Submit']")
	private WebElement   Submit ;
	
	 public  BioPage  (WebDriver driver) {
			PageFactory.initElements(driver, this);
		}
	 
	 public void  textarea()
		{
		 textarea.sendKeys("testingengineer");	
		}
	
	public void  clickSubmit()
	{
		Submit.click();	
	}
}
