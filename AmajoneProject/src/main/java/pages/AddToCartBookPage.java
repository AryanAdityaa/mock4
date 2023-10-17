package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddToCartBookPage {

	@FindBy (xpath = "//a[text()=' Add to Cart ']")
	private WebElement clickOnAddToCart;

	public AddToCartBookPage (WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void selectAddToCart() 
	{
		clickOnAddToCart.click();
	}
}
