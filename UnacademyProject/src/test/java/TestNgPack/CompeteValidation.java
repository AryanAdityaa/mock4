package TestNgPack;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pages.JoinForFree;
import pages.UnaccademyCompeteOnHomePage;

public class CompeteValidation {
 
	private WebDriver driver;
	@BeforeClass 
	public void  launchBrowser() {
		driver = new ChromeDriver();
			
	}
	@BeforeMethod
	public void Homepage () 
	{
		driver.get("https://unacademy.com/goal/bank-exams/RTPSX/browse");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(10000));
	}
	 @Test
			 public void competeTab() throws InterruptedException 
	 {
		UnaccademyCompeteOnHomePage unaccademyCompeteOnHomePage = new UnaccademyCompeteOnHomePage(driver);
			
		unaccademyCompeteOnHomePage.ClickCompeteOnHomePage();
		Thread.sleep(2500);
		unaccademyCompeteOnHomePage.clickAllState();
		Thread.sleep(2500);
		unaccademyCompeteOnHomePage.selectingOneStateFromOptions();
	 }
	 @Test
		public void joinFreeTabCheck() throws InterruptedException 
	{
		 JoinForFree joinForFree = new JoinForFree(driver);
		 joinForFree.ClickCompeteOnHomePage();
		 Thread.sleep(2000);
		 joinForFree.sendMobileNumber();
		 joinForFree.ClickContinue();
	
	}
	 
	 
	
	@AfterMethod
	public void afterMethod()
	{
	 System.out.println("theEnd");
	}
	
	@AfterClass
	public void afterClass() {
		driver.close();
	}
}
