package instagramClass;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pages.MessagePage;
import pages.NotNow2Page;
import pages.SignInOrLogin;
import pages.notNowPage;

public class MessageClass {

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
		
//		NotNow2Page notNow2Page = new NotNow2Page(driver);
//		notNow2Page.NotNow();
//		
		MessagePage messagePage = new MessagePage(driver);
		
		messagePage.clickMessage();
		messagePage.SelectSpecificPerson();
		messagePage.WriteMessage();
		messagePage.clickSend();
		
		
		
		
	}
	
}
