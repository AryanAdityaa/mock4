package TestNGPack;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class DemoProject2 {

	private WebDriver driver ;
	
	@BeforeSuite
	public void beforeSuite() {
		System.out.println("test before Suite ");
	}
	
	@BeforeTest
	public void beforeTest() {
		System.out.println("test before test");
	}
	@BeforeClass
	public void beforeClass() {
	System.out.println("BeforeProject2");
	}
	
	@BeforeMethod
	public void beforeMethod() {
	System.out.println("starting for Every execution of test2");
	}
	
	@Test
	public void test() {
		System.out.println("core testing2");
		
		String expectedURL = "https://unacademy.com/" ;
		String actualURL = "https://unacademy.com/" ;
		
		String expectedtitle = " unacademy " ;
		String actualtitle = " unacademy " ;
		
		SoftAssert softAssert = new SoftAssert ();
		
		softAssert.assertEquals(actualURL , expectedURL);
		System.out.println("yuuuy");
		
		softAssert.assertEquals(expectedtitle , actualtitle);
		System.out.println("jjkd");
		
		softAssert.assertAll();
		
	}
	
	@AfterMethod
	public void afterMethod() {
	System.out.println("ending point of Every execution of test2");
	}
	
	@AfterClass
	public void afterClass() {
	System.out.println("the end2");
	
     }
	@AfterTest
	public void afterTest() {
		System.out.println("test after test");
	}
	@AfterSuite
	public void afterSuite() {
		System.out.println("test after Suite ");
	}
}
