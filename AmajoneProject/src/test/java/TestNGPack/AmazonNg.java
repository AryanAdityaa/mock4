package TestNGPack;



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


import pages.AmazoneTv;
import pages.HomePage;
import pages.NewReleasePage;

import pages.SelectNewRelaseItem;

public class AmazonNg {
	
	private WebDriver driver ;
	private NewReleasePage newReleasePage ;
	private SelectNewRelaseItem selectNewRelaseItem;
	private AmazoneTv amazoneTv;
	private HomePage homePage ;
	
	
	@Parameters("browser")
	@BeforeTest
	public void launchBrowser(String browserName) 
	{
    if (browserName.equals("Chrome"))
    {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}
	
	    if (browserName.equals("Edge"))
	    {
	    	driver = new EdgeDriver();
			driver.manage().window().maximize();
		}
	}
	
	@BeforeClass
	public void CreatePomClassObject() 
	{
		newReleasePage = new NewReleasePage(driver);
		selectNewRelaseItem = new SelectNewRelaseItem(driver);
		amazoneTv = new AmazoneTv(driver);
		homePage = new HomePage(driver);
	}
	
	@BeforeMethod
	public void homeAmazon() 
	{
		driver.get("https://www.amazon.in");

	}
	@Test
	public void test1() throws InterruptedException 
	{
		newReleasePage.selectNewRelease();
		Thread.sleep(2900);
		
		Thread.sleep(2900);
		selectNewRelaseItem.SelectAnyProduct();
		Thread.sleep(2900);
    }
	
	@Test 
	public void test4() 
	{
		amazoneTv.AmazoneTvOnHomePage();
		amazoneTv.WebSeriesOnAmazon();
		amazoneTv.ShowInTheWebseries();	
	}
	
	@AfterMethod
	public void afterMethod() 
	{
		homePage.BackToAmazonHomePage();	
	}
	
	@AfterClass
	public void ClearObject()
	{
		newReleasePage = null;
		selectNewRelaseItem = null;
		amazoneTv = null;
		homePage = null;
	 }
	
	@AfterTest
	public void afterdem() 
	{
		driver.close();
		driver = null;
		System.gc();
//	System.out.println("the end");
	}
	
	
}



