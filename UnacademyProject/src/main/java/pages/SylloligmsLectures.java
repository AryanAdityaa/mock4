package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SylloligmsLectures {

	@FindBy (xpath = "//p[text()='Basics of Syllogism (in Hindi)']")
	private WebElement Syllogism1 ; 
	
	@FindBy (xpath = "//p[text()='Syllogism - When to Check for Possibility (in Hindi)']")
	private WebElement  Syllogism2 ;
	
	@FindBy (xpath = "//p[text()='Syllogism with Negative Statement and Conclusion (in Hindi)']")
	private WebElement Syllogism3 ;
	
	@FindBy (xpath = "//p[text()='Syllogism (in Hindi)']")
	private WebElement  Syllogism4;
	
	
	public SylloligmsLectures  (WebDriver driver) 
	{
		          //TO FIND ELEMENTS
		PageFactory.initElements(driver, this);
	}
	
	public void  clickSyllogism1 ()
	{
		Syllogism1 .click();
	}
	

	public void    clickSyllogism2()
	{
		 Syllogism2.click();
	}
	

	public void   clickSyllogism3()
	{
		Syllogism3.click();
	}
	

	public void   clickSyllogism4()
	{
		Syllogism4.click();
	}
	
	
}
