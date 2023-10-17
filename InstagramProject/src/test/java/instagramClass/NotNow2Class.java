package instagramClass;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pages.NotNow2Page;

public class NotNow2Class {

	public static void main(String[] args) {
		//System.setProperty(null, null);
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.instagram.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(15000));
		
		NotNow2Page notNow2Page = new NotNow2Page(driver);
		notNow2Page.NotNow();
		
		
}
}
