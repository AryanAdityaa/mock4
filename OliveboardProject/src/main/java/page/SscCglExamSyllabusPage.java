package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SscCglExamSyllabusPage {

	@FindBy (xpath = "//span[text()='Syllabus']")
	private WebElement SscCglSyllabus ;
	
	
	 public  SscCglExamSyllabusPage  (WebDriver driver) {
			PageFactory.initElements(driver, this);
		}
	
	public void  clickOnSscCglsyllabus ()
	{
		SscCglSyllabus.click();
	}
}
