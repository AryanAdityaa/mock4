package TestNgPack;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pages.InstructionPage;
import pages.OtherCoursesOnHomePage;
import pages.SylloligmsLectures;
import pages.TakeAtestPage;
import pages.TestOnHomePage;


public class OtherCourceTestNgValidation {
 
	private WebDriver driver;
	@BeforeClass 
	public void  launchBrowser() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(10000));
		
	}
	@BeforeMethod
	public void Homepage () {
		driver.get("https://unacademy.com/goal/bank-exams/RTPSX/browse");
	}
	
	@Test
			public void otherCourses() throws InterruptedException 
	{
	 	OtherCoursesOnHomePage otherCoursesOnHomePage =new OtherCoursesOnHomePage(driver); 
		otherCoursesOnHomePage.ClickOtherCourses();
		Thread.sleep(2000);
		
		otherCoursesOnHomePage.clickSylloligs();
		
		SylloligmsLectures sylloligmsLectures = new SylloligmsLectures(driver);
		Thread.sleep(2000);
		
		sylloligmsLectures.clickSyllogism1();
		Thread.sleep(2000);
//		sylloligmsLectures.clickSyllogism2();
//		Thread.sleep(2000);
//		sylloligmsLectures.clickSyllogism3();
//		Thread.sleep(2000);
//		sylloligmsLectures.clickSyllogism4();
	}
	
	@Test 
	public void takeATest() throws InterruptedException 
	{
		TestOnHomePage testOnHomePage = new TestOnHomePage(driver);
		testOnHomePage.clickOnTest();
		
		Thread.sleep(2000);
		TakeAtestPage takeAtestPage = new TakeAtestPage(driver);
		Thread.sleep(2000);
		takeAtestPage.ClickOnTakeATest();
		Thread.sleep(2000);
		InstructionPage instructionPage = new InstructionPage(driver);
		Thread.sleep(2000);
		instructionPage.selectInstruction();
   }
	
	@AfterMethod
	public void afterMethod(){
	 System.out.println("theEnd");
		
	}
	@AfterClass
	public void afterClass() {
		driver.close();
	}
}
