package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SscCglExamPage {

	@FindBy (xpath = "(//p[text()='SSC CGL'])[1]")
	private WebElement SscCglExams ;
	
	
	 public  SscCglExamPage  (WebDriver driver) {
			PageFactory.initElements(driver, this);
		}
	
	public void  clickOnSscCglExamOnMainPage ()
	{
		SscCglExams.click();
	}
}
