package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class IbpspoElementsPage {

	@FindBy (xpath = "//span[text()='Application Form']")
	private WebElement ApplicationForm ;
	
	@FindBy (xpath = "//span[text()='Admit Card']")
	private WebElement AdmitCard ;
	
	@FindBy (xpath = "//span[text()='Cut Offs']")
	private WebElement CutOffs ;
	
	
	 public  IbpspoElementsPage  (WebDriver driver) {
			PageFactory.initElements(driver, this);
		}
	
	
	
	
	
	
	public void  clickApplicationFormElement ()
	{
		ApplicationForm.click();
	}
	
	public void clickOnAdmitCard()
	{
		AdmitCard.click();
	}
	
	public void clickOnCutOffs()
	{
		CutOffs.click();
	}
}
