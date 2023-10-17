package TestPack;

import java.time.Duration;
import java.util.ArrayList;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pages.EbookBuyOptionPage;
import pages.EbookPage;
import pages.FooterPage;

public class EbookSection {

	public static void main(String[] args) throws InterruptedException {
		//System.setProperty(null, null);
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.adda247.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(15000));
		
		FooterPage footerPage = new FooterPage(driver);
		footerPage.EbookOptions();
		ArrayList<String> addr = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(addr.get(1));
		
		EbookPage ebookPage = new EbookPage(driver);
		ebookPage.SpecificProuctSelection();
		
		EbookBuyOptionPage ebookBuyOptionPage = new EbookBuyOptionPage(driver);
		ebookBuyOptionPage.SpecificProuctSelection();
		Thread.sleep(2000);
		ebookBuyOptionPage.CouponRemoveAndThenSelect();
		ebookBuyOptionPage.continueToBuy();
		ebookBuyOptionPage.FeedName();
		ebookBuyOptionPage.FeedMobileNumber();
		ebookBuyOptionPage.FeedEmailAddress();
		ebookBuyOptionPage.ContinueClick();
		
}
}
