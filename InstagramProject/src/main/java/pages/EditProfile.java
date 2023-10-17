package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EditProfile {

	@FindBy (xpath = "//a[text()='Edit profile']")
	private WebElement   Editprofile1 ;
	
	
	 public   EditProfile  (WebDriver driver) {
			PageFactory.initElements(driver, this);
		}
	
	public void ProfileEdit()
	{
		Editprofile1.click();	
	}
}
