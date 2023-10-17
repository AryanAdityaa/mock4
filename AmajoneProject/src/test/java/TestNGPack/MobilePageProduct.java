package TestNGPack;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


import pages.HomePage;
import pages.MobileOnHomePage;


public class MobilePageProduct {


	private WebDriver driver ;

	@BeforeClass
	public void launchBrowser() {
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	
	}
	@BeforeMethod
	public void homeAmazon() {
		driver.get("https://www.amazon.in");

	}
	
	@Test
	public void test3() {
        MobileOnHomePage mobileOnHomePage = new MobileOnHomePage(driver);
		
		mobileOnHomePage.MobileOnHomePageClick();
		mobileOnHomePage.BroadbandOnMobilePage();
		mobileOnHomePage.BroadbandSpecificProduct();
	}
	@AfterMethod
	public void afterMethod() {
		HomePage homePage = new HomePage(driver);
		homePage.BackToAmazonHomePage();	}
	@AfterClass
	public void afterClass() {
		driver.close();
	}
}
