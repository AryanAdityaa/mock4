package TestNgClass;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pages.BioPage;
import pages.EditProfile;
import pages.GOToProfilePage;
import pages.LogoutPage;
import pages.MessagePage;
import pages.NotNow2Page;
import pages.Reels_Page;
import pages.SignInOrLogin;

import pages.notNowPage;


public class InstagramTestNgClassTest {

	
	private WebDriver  driver;
	
	@BeforeClass
	public void LaunchTheBrowser(){
		driver = new ChromeDriver();
		
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(12));
	}
	
	@BeforeMethod
	public void SigninLogin() throws InterruptedException{
		driver.get("https://www.instagram.com/");
		driver.manage().window().maximize();
		SignInOrLogin signInOrLogin = new SignInOrLogin	(driver);
		signInOrLogin.sendUserName();
		signInOrLogin.sendPassword();
		signInOrLogin.login();
		
		notNowPage notNowPage = new notNowPage(driver);
		notNowPage.NotNow();
		Thread.sleep(2000);
		NotNow2Page notNow2Page = new NotNow2Page(driver);
		notNow2Page.NotNow();
	}
//	
//	@Test (priority = 1)
//	public void Reels() throws InterruptedException{
//		Reels_Page reels_Page = new Reels_Page (driver);
//		reels_Page.ClickReels();
//		Thread.sleep(10000);
//		
//		
//	}
	
	@Test  (priority = 2)
	public void Message() {
		MessagePage messagePage = new MessagePage(driver);
		
		messagePage.clickMessage();
		messagePage.SelectSpecificPerson();
		messagePage.WriteMessage();
		messagePage.clickSend();
		
		driver.close();
	}
	
//	@Test (priority = 3)
//	public void Profile(){
//		GOToProfilePage gOToProfilePage = new GOToProfilePage(driver);
//		gOToProfilePage.GoToProfile();
//		
//		EditProfile editProfile = new EditProfile(driver);
//		editProfile.ProfileEdit();
//		
//		BioPage bioPage = new BioPage(driver);
//		bioPage.textarea();
//		bioPage.clickSubmit();
//	}
	
	
	
	@AfterMethod
	public void  Logout(){
		LogoutPage logoutPage = new LogoutPage(driver);
		logoutPage.clickMore();
		logoutPage.clickLogout();
	}
	
	@AfterClass 
	public void afterclass() {
		System.out.println("the end");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
