package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FooterPage {

	@FindBy (xpath = "(//a[text()='Law Entrance Exams'])[2]")
	private WebElement   footerClickLawExam ;
	
	 public  FooterPage  (WebDriver driver) {
			PageFactory.initElements(driver, this);
		}
	
	public void  validateLawentranceExam()
	{
		footerClickLawExam.click();	
	}
}
