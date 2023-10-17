package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TestOnHomePage {

	@FindBy (xpath = "(//a[@class=' e2khoyd1 css-ne1rkr-Link-Item e1l00lnb0'])[2]")
	private WebElement  ClickTest;
	
	
	public TestOnHomePage  (WebDriver driver) 
	{
		          //TO FIND ELEMENTS
		PageFactory.initElements(driver, this);
	}
	
	public void  clickOnTest ()
	{
		ClickTest.click();
	}
}
