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

import pages.AddToCartBookPage;
import pages.BestSellerPage;
import pages.BooksPage;
import pages.HomePage;
import pages.PhysiologyOfBookPage;

public class BestSeller {

	private WebDriver driver ;
	private BestSellerPage bestSellerPage ;
	private BooksPage booksPage;
	private PhysiologyOfBookPage physiologyOfBookPage; 
	private HomePage homePage;
	private AddToCartBookPage addToCartBookPage;
	
	@Parameters("browser")
	@BeforeTest
	public void launchBrowser(String browserName) 
	{
		if (browserName.equals("Chrome"));
		{
			driver = new ChromeDriver();
			driver.manage().window().maximize();
		}
			 if (browserName.equals("Edge"));
				{
					driver = new EdgeDriver();
					driver.manage().window().maximize();
				}
	}
	
	@BeforeClass
	public void CreatePomObject()
	{
		bestSellerPage = new BestSellerPage(driver);
		booksPage = new BooksPage(driver);
	 	physiologyOfBookPage = new PhysiologyOfBookPage(driver);
	 	homePage = new HomePage(driver);
	 	addToCartBookPage = new AddToCartBookPage(driver);
	}
	
	@BeforeMethod
	public void homeAmazon() 
	{
		driver.get("https://www.amazon.in");
	}
	
	@Test
	public void BestSellerBook() 
	{
		bestSellerPage.ClickOnBestSellerPage();
		booksPage.ClickOnBooks();
		physiologyOfBookPage.selectSpecificBook();
		addToCartBookPage.selectAddToCart();
	}
//	
//	@AfterMethod
//	public void afterMethod() 
//	{
//	    homePage.BackToAmazonHomePage();	
//	}
	
	@AfterClass
	public void ClaerObject() 
	{
		bestSellerPage = null;
		booksPage = null;
	 	physiologyOfBookPage = null;
	 	homePage = null;
	}
	
	@AfterTest
	public void afterClass() 
	{
		driver.close();
		driver = null;
		System.gc();
//		System.out.println("fun");
	}
	
}
