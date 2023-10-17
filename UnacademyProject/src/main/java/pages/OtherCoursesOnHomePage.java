package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OtherCoursesOnHomePage {

	@FindBy (xpath = "//a[contains(text(),'Other courses')]")
	private WebElement OtherCourses;
	
	@FindBy (xpath = "//h4[text()='(Hindi) Syllogism for Banking']")
	private WebElement Sylloligsm;
	
	
				public OtherCoursesOnHomePage (WebDriver driver) 
				{
					          //TO FIND ELEMENTS
					PageFactory.initElements(driver, this);
				}
				
				

	
		public void ClickOtherCourses ()
		{
			OtherCourses.click();
		}
				
		public void clickSylloligs() 
		{
			Sylloligsm.click();
		}
		
	
	
	
}
