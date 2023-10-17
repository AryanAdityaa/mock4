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
import page.SscCglExamPage;
import page.SscCglExamSyllabusPage;
import page.SscElementPage;

public class SscTestNgClass {
 
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
//		if (browsername.equals("Edge"));
//		{
//			driver = new EdgeDriver();
//			driver.manage().window().maximize();
//			driver.get("https://www.oliveboard.in/");
//			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(12));
//		}
		}
	
	@BeforeMethod
	public void BankingOnHome() 
	{
		BankingAndInsuranceOnMainPage bankingAndInsuranceOnMainPage = new BankingAndInsuranceOnMainPage(driver);
		bankingAndInsuranceOnMainPage.clickOnBankingAndInsuranceOnMainPage();
	}
		@Test
	public void Ssccgl() 
	{
		SscElementPage sscElementPage = new SscElementPage(driver);
		sscElementPage.clickApplicationFormElement();
		
		SscCglExamPage sscCglExamPage = new SscCglExamPage(driver);
		sscCglExamPage.clickOnSscCglExamOnMainPage();
		
		SscCglExamSyllabusPage sscCglExamSyllabusPage = new SscCglExamSyllabusPage(driver);
		sscCglExamSyllabusPage.clickOnSscCglsyllabus();	
		
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
