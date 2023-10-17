package OliveTestNg;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import page.BankingAndInsuranceOnMainPage;
import page.SbiPoElementsPage;
import page.SbipoHomePage;


public class SbiPoTestNgClass {
 
private WebDriver driver ;
	
	@Parameters ("browser")
	@BeforeTest 
		public void launchBrowser(String browsername) 
	{
		if (browsername.equals("chrome"));
	{
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.oliveboard.in/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(12));
	}
//	if (browsername.equals("Edge"));
//	{
//		driver = new EdgeDriver();
//		driver.manage().window().maximize();
//		driver.get("https://www.oliveboard.in/");
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(12));
//	}
	}
	
	@Test
	public void SbipoValidation() 
	{
		SbipoHomePage sbipoHomePage = new SbipoHomePage(driver);
		sbipoHomePage.clickOnSbiPoOnHomePage();
		
		SbiPoElementsPage sbiPoElementsPage = new SbiPoElementsPage(driver);
		sbiPoElementsPage.clickOnMemory();	
		sbiPoElementsPage.clickOnCutOffs();
		sbiPoElementsPage.clickOnAdmitCard();	
	}
	
//	@AfterMethod
//	public void  () 
//	{
//		
//	}
	
	@AfterClass 
	public void afterclass() 
	{
	System.out.println("TheEnd");	
	}


}
