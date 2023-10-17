package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MessagePage {

	@FindBy (xpath = "//span[text()='Messages']")
	private WebElement   Messages ;
	
	@FindBy (xpath = "//span[text()='Priya Satyajit More']")
	private WebElement   Satyajit ;
	
	@FindBy (xpath = "//p[@class='xat24cr xdj266r']")
	private WebElement   typeMessage ;
	
	@FindBy (xpath = "//div[text()='Send']")
	private WebElement   Send ;
	
	 public  MessagePage  (WebDriver driver) {
			PageFactory.initElements(driver, this);
		}
	
	public void  clickMessage()
	{
		Messages.click();	
	}
	public void  SelectSpecificPerson()
	{
		Satyajit.click();	
	}
	
	public void  WriteMessage()
	{
		typeMessage.sendKeys("message send by selenium");	
	}
	public void  clickSend()
	{
		Send.click();
	}
}
