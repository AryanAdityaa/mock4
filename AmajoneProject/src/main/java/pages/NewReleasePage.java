package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NewReleasePage {

	@FindBy (xpath = "//a[text()='New Releases']")
	private WebElement clickNewRelease;
	
	
	public   NewReleasePage (WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void selectNewRelease () 
	{
		clickNewRelease.click();
	}
}
