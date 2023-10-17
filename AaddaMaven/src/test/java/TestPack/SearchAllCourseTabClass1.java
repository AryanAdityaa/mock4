package TestPack;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pages.SbiPoOnlineClassPage;
import pages.SearchTab;
import pages.SignUp_LoginPage;

public class SearchAllCourseTabClass1 {

public static void main(String[] args) throws InterruptedException {
		
		//System.setProperty(null, null);
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.adda247.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(15000));
		SignUp_LoginPage signUp_LoginPage = new SignUp_LoginPage (driver);
		Thread.sleep(2500);
		
		signUp_LoginPage.SignUpLoginclick();
		signUp_LoginPage.sendYourMail();
		signUp_LoginPage.sendYourPassword();
		signUp_LoginPage.clickOnLoginButton();
		
		SearchTab  searchTab = new  SearchTab (driver); 
		searchTab.clcikAllCourses();
		searchTab.selectBanking();
		searchTab.selectSbiPo();
		SbiPoOnlineClassPage sbiPoOnlineClassPage = new SbiPoOnlineClassPage(driver);
		sbiPoOnlineClassPage.selectSbiPoOnlineClassPage();
		
}
}
