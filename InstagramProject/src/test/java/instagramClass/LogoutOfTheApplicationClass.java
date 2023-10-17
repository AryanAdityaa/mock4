package instagramClass;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pages.LogoutPage;
import pages.SignInOrLogin;
import pages.notNowPage;

public class LogoutOfTheApplicationClass {

	public static void main(String[] args) {
		//System.setProperty(null, null);
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.instagram.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(15000));
		
		SignInOrLogin signInOrLogin = new SignInOrLogin	(driver);
		signInOrLogin.sendUserName();
		signInOrLogin.sendPassword();
		signInOrLogin.login();
		
		notNowPage notNowPage = new notNowPage(driver);
		notNowPage.NotNow();
		
		LogoutPage logoutPage = new LogoutPage(driver);
		logoutPage.clickMore();
		logoutPage.clickLogout();
		
		
		
}
}
