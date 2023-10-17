package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EbookPage {

	@FindBy (xpath = "(//div[@class='productTitle'])[1]")
	private WebElement selectOneProduct ; 
	
	
	public EbookPage (WebDriver driver) 
	{
		         
		PageFactory.initElements(driver, this);
	}
	
	
	
	public void  SpecificProuctSelection () 
	{
		selectOneProduct.click();
	}
}
