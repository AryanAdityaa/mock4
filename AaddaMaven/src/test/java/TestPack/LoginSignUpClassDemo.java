package TestPack;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pages.SignUp_LoginPage;

public class LoginSignUpClassDemo {

public static void main(String[] args) throws InterruptedException {
		
		//System.setProperty(null, null);
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.adda247.com/");
		driver.manage().window().maximize();
		SignUp_LoginPage signUp_LoginPage = new SignUp_LoginPage (driver);
		signUp_LoginPage.SignUpLoginclick();
		
		signUp_LoginPage.sendYourMail();
		
		signUp_LoginPage.sendYourPassword();
		
		signUp_LoginPage.clickOnLoginButton();
}
}
