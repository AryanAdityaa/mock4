package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchTab {

	@FindBy (xpath = "//div[contains(text(),'All Courses')]")
	private WebElement AllCourses;
	
	@FindBy (xpath = "//li[text()='Banking']")
	private WebElement ClickBanking;
	
	@FindBy (xpath = "//a[text()='SBI PO']")
	private WebElement SbiPo;
	
	//constructor 
	
	public  SearchTab (WebDriver driver) 
	{
		          //TO FIND ELEMENTS
		PageFactory.initElements(driver, this);
	}
	/////////////
	//method
	public void  clcikAllCourses() 
	{
		AllCourses.click();
	}
	
	public void  selectBanking() 
	{
		ClickBanking.click();
	}
	
	public void  selectSbiPo() 
	{
		SbiPo.click();
	}
	
}
