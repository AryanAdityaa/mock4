package TestPack;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pages.FooterPage;

public class FooterClass {

	public static void main(String[] args) {
		//System.setProperty(null, null);
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.adda247.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(15000));
				
		FooterPage footerPage = new FooterPage(driver);
		footerPage.CareerOptions();
		footerPage.CareerForOppurtunityOptions();
		footerPage.ContentPartnerOptions();
		footerPage.EbookOptions();
		footerPage.GetOnlineCoachingOptions();
		footerPage.MediaOptions();
				
	}
}
