package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SelectNewRelaseItem {

	@FindBy (xpath = "//a[text()='New Releases']")
	private WebElement clickNewRelaseItemProduct;
	
	
	public   SelectNewRelaseItem (WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void SelectAnyProduct() 
	{
		clickNewRelaseItemProduct.click();
	}
}
