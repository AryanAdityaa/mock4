package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SbiPoElementsPage {

	@FindBy (xpath = "//span[text()='Memory Based Paper']")
	private WebElement Memory ;
	
	@FindBy (xpath = "//span[text()='Admit Card']")
	private WebElement AdmitCard ;
	
	@FindBy (xpath = "//span[text()='Cut Offs']")
	private WebElement CutOffs ;
	
	
	
	
	
	
	public  SbiPoElementsPage (WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	
	public void  clickOnMemory ()
	{
		Memory.click();
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
