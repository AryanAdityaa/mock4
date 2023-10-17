package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SbiPoOnlineClassPage {

	@FindBy (xpath = "//a[text()='SBI PO  Online Live Classes ']")
	private WebElement SbiPoOnlineClass;
	
	//constructor 
	
	public  SbiPoOnlineClassPage (WebDriver driver) 
	{
		          //TO FIND ELEMENTS
		PageFactory.initElements(driver, this);
	}
	/////////////
	//method
	public void  selectSbiPoOnlineClassPage() 
	{
		SbiPoOnlineClass.click();
	}
	
}
