package seleniumPractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserNavigationCommand {

	public static void main (String[] args) {
		 System.setProperty("webdriver.chrome.driver", "/Users/neha/Downloads/Drivers/chromedriver");
		 WebDriverManager.chromedriver().setup();
		 WebDriver driver = new ChromeDriver();
		 
		 //Navigation specific Command
		 driver.navigate().to("https://www.amazon.in");
		 
		 //Navigate backward
		 driver.navigate().back();
		 
		 //Navigate forward
		 driver.navigate().forward();
		 
		 //Refresh
		 driver.navigate().refresh();
		 
		 driver.close();
		 
		  
		
		
	}
	
}
