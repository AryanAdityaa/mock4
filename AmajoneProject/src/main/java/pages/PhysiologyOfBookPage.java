package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PhysiologyOfBookPage {

	@FindBy (xpath = "//div[text()='The Psychology Of Money']")
	private WebElement clickOnPhysiologyOFMoney;

	public PhysiologyOfBookPage (WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void selectSpecificBook() 
	{
		clickOnPhysiologyOFMoney.click();
	}
	
}
