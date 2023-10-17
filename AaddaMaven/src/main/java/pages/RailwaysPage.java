package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RailwaysPage {

	@FindBy (xpath = "//li[text()='Railways']")
	private WebElement clickRailways;
	
	@FindBy (xpath = "	//a[text()='Skill Development Courses']")
	private WebElement clickOnSkillDevelopmentCourses;
	
	
	public  RailwaysPage (WebDriver driver) 
	{
		          //TO FIND ELEMENTS
		PageFactory.initElements(driver, this);
	}
	
	
	
	public void selectRailways () 
	{
		clickRailways.click();
	}
	
	public void selectSkillDevelopmentCourses () 
	{
		clickOnSkillDevelopmentCourses.click();
	}
	
	
	
	
	
	
	
	
	
	
}
