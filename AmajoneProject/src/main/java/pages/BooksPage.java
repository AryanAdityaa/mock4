package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BooksPage {

	@FindBy (xpath = "(//a[text()='Books'])[2]")
	private WebElement clickOnBooks;

	public BooksPage (WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void ClickOnBooks() 
	{
		clickOnBooks.click();
	}
}
