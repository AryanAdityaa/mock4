package TestPack;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pages.LogoutPage;

public class LogoutClassDemo {

public static void main(String[] args) throws InterruptedException {
		
		//System.setProperty(null, null);
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.adda247.com/");
		driver.manage().window().maximize();
		
		LogoutPage logoutPage = new LogoutPage(driver);
		logoutPage.ApplicationLogoutClick();
		
		
		
		
}
}
