package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BankingAndInsuranceOnMainPage {

	@FindBy (xpath = "(//a[text()='Banking & Insurance'])[1]")
	private WebElement   BankingAndInsurance;
	
	
	 public  BankingAndInsuranceOnMainPage  (WebDriver driver) {
			PageFactory.initElements(driver, this);
		}
	
	public void  clickOnBankingAndInsuranceOnMainPage ()
	{
		BankingAndInsurance.click();
	}
}
