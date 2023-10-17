package TestNgadda;

import java.time.Duration;
import java.util.ArrayList;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import pages.EbookBuyOptionPage;
import pages.EbookPage;
import pages.FooterPage;


import pages.SignUp_LoginPage;

public class FooterElement {

	private WebDriver driver ;
	private FooterPage footerPage ; 
	private EbookPage ebookPage  ;
	private EbookBuyOptionPage ebookBuyOptionPage; 
	
	@Parameters ("browser")
	@BeforeTest 
	public void  launchBrowser(String browserName)
	{
		if (browserName.equals("Edge")) {
		
			driver = new EdgeDriver();
			driver.manage().window().maximize();
		}
		if (browserName.equals("Chrome")) {
			
			driver = new ChromeDriver();
			driver.manage().window().maximize();
		}
	}
	
	@BeforeClass
	public void CreatingPOMObject () {
	  footerPage = new FooterPage(driver);	
	  ebookPage = new EbookPage(driver);
	  ebookBuyOptionPage = new EbookBuyOptionPage(driver);
	
	}
	@BeforeMethod
	public void loginSignup() {
		driver.get("https://www.adda247.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(12));
	}
//	@Test (priority = 1)
//	public void signin () {
//		SignUp_LoginPage signUp_LoginPage = new SignUp_LoginPage (driver);
//		signUp_LoginPage.SignUpLoginclick();
//		signUp_LoginPage.sendYourMail();
//		signUp_LoginPage.sendYourPassword();
//		signUp_LoginPage.clickOnLoginButton();	
//		
//		}
	
//	@Test (priority = 3)
//	public void footerSection () 
//	{
//		
//		FooterPage footerPage = new FooterPage(driver);
//		footerPage.CareerOptions();
//		footerPage.CareerForOppurtunityOptions();
//		footerPage.ContentPartnerOptions();
//		footerPage.EbookOptions();
//		footerPage.GetOnlineCoachingOptions();
//		footerPage.MediaOptions();
//		
//	}
	@Test (priority = 2)
	public void EbookOnFooter () 
	{
		
		 
		footerPage.EbookOptions();
		
		ArrayList<String> addr = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(addr.get(1));
		
		 
		ebookPage.SpecificProuctSelection();
		
		 
		ebookBuyOptionPage.SpecificProuctSelection();
//		ebookBuyOptionPage.CouponRemoveAndThenSelect();
		ebookBuyOptionPage.continueToBuy();
		ebookBuyOptionPage.FeedName();
		ebookBuyOptionPage.FeedMobileNumber();
		ebookBuyOptionPage.FeedEmailAddress();
		ebookBuyOptionPage.ContinueClick();
		
	}
	
//	@AfterMethod
//	public void Logout() {
//		
//	}
	
	@AfterClass 
	public void clearObject() {
		  footerPage = null; 
		  ebookPage  =null;
		  ebookBuyOptionPage = null; 
	}
	
	@AfterTest() 
	public void closeBrowser ()
	{
		driver.quit();
		driver = null;
		System.gc();
	}
	
}
