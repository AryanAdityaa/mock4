package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ElementsInSaltPage {

	@FindBy (xpath = "//span[text()='Overview']")
	private WebElement  clickOverview  ;
	
	@FindBy (xpath = "//span[text()='Notification']")
	private WebElement   clicNotification ;
	
	@FindBy (xpath = "//span[text()='Exam Pattern']")
	private WebElement    clickExamPattern ;
	
	@FindBy (xpath = "//span[text()='Application Form']")
	private WebElement    clickApplication;
	
	
	
	public   ElementsInSaltPage (WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
	}
		
		public void Overview ()
		{
			clickOverview.click();
		}

		public void  Notification ()
		{
			clicNotification.click();
	    }

		public void   ExamPattern()
		{
			clickExamPattern.click();
	    }
		public void  Application()
		{
			clickApplication.click();
	    }






}
