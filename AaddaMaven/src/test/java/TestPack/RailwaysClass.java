package TestPack;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pages.RailwaysPage;
import pages.SearchTab;

public class RailwaysClass {

	public static void main(String[] args) throws InterruptedException {
		
		//System.setProperty(null, null);
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.adda247.com/");
		driver.manage().window().maximize();
				
		SearchTab  searchTab = new  SearchTab (driver); 
		Thread.sleep(4000);
		
		searchTab.clcikAllCourses();
		Thread.sleep(4000);
		
		RailwaysPage railwaysPage = new RailwaysPage(driver);
		railwaysPage.selectRailways();
		Thread.sleep(4000);
		railwaysPage.selectSkillDevelopmentCourses();
		
		
		
		
		
		
		
		
	}
}
