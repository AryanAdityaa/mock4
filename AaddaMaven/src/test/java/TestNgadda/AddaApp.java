package TestNgadda;

import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import pages.LogoutPage;
import pages.RailwaysPage;
import pages.SbiPoOnlineClassPage;
import pages.SearchTab;
import pages.SignUp_LoginPage;

public class AddaApp {

	private WebDriver driver ;
	private SearchTab  searchTab;
	private SbiPoOnlineClassPage sbiPoOnlineClassPage;  
	private RailwaysPage railwaysPage ;
	private SignUp_LoginPage signUp_LoginPage;

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
	   searchTab = new  SearchTab (driver); 
	   sbiPoOnlineClassPage = new SbiPoOnlineClassPage(driver);
	   railwaysPage = new RailwaysPage(driver);
	   signUp_LoginPage = new SignUp_LoginPage (driver);
	}
	
	@BeforeMethod
	public void loginSignup() {
		driver.get("https://www.adda247.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(12));
		
//		SignUp_LoginPage signUp_LoginPage = new SignUp_LoginPage (driver);
//		signUp_LoginPage.SignUpLoginclick();
//		signUp_LoginPage.sendYourMail();
//		signUp_LoginPage.sendYourPassword();
//		signUp_LoginPage.clickOnLoginButton();
	}
	
	@Test(priority = 2)
	public void Banking () {

		 
		searchTab.clcikAllCourses();
		searchTab.selectBanking();
		searchTab.selectSbiPo();
		 
		sbiPoOnlineClassPage.selectSbiPoOnlineClassPage();
		
	}
	@Test (priority = 3)
	public void Railways () throws InterruptedException {
		
		  
		searchTab.clcikAllCourses();
		 
		railwaysPage.selectRailways();
		
		
	}
	
	@Test (priority = 1)
	public void SigninLogout () 
	{
		signUp_LoginPage.SignUpLoginclick();
		signUp_LoginPage.sendYourMail();
		signUp_LoginPage.sendYourPassword();
		signUp_LoginPage.clickOnLoginButton();	
	}
//	@AfterMethod
//	public void logout1 () {
//		
//		LogoutPage logoutPage = new LogoutPage(driver);
//		logoutPage.ApplicationLogoutClick();
//		
//	}
	@AfterClass 
	public void clearObject() {
		searchTab = null;
		sbiPoOnlineClassPage = null;  
		railwaysPage = null ;
		signUp_LoginPage = null; 
	}
	
	@AfterTest() 
	public void closeBrowser ()
	{
		driver.quit();
		driver = null;
		System.gc();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
