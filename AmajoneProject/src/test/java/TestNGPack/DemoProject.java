package TestNGPack;

import static org.testng.Assert.fail;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DemoProject {

private WebDriver driver ;
	
	@BeforeClass
	public void beforeClass() {
	System.out.println("BeforeProject1");
	}
	
	@BeforeMethod
	public void beforeMethod() {
	System.out.println("starting for Every execution of test1");
	}
	
	@Test
	public void test() {
		System.out.println("core testing1");
//		Assert.fail();
//		
//		String expectedURL = "https://unacademy.com/" ;
//		String actualURL = "https://unacademy.com/" ;
//		
//		Assert.assertEquals(actualURL, expectedURL);
//		System.out.println("yes");
//
//		Assert.assertNotEquals(actualURL, expectedURL);
//		System.out.println("how");
//        boolean r = expectedURL.equals(actualURL);
//      Assert.assertTrue(r);
//		Assert.assertFalse(r);
//		
//		if(expectedURL.equals(actualURL));
//		{
//			System.out.println("theyuvi");
//		}
//		else
//		{
//			
//		}
		
		
		
	}
	
	@AfterMethod
	public void afterMethod() {
	System.out.println("ending point of Every execution of test1");
	}
	
	@AfterClass
	public void afterClass() {
		System.out.println("the end1");
	
}
}
