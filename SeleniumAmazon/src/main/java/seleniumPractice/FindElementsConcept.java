package seleniumPractice;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FindElementsConcept {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "/Users/neha/Downloads/Drivers/chromedriver");
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		
		
		//driver.get("http://www.half.ebay.com");
		driver.get("http://www.facebook.com");
		List <WebElement> linkList = driver.findElements(By.tagName("a"));
		
		//Size of list (count of Links)
		System.out.println(linkList.size());
		
		for ( int i=0; i<linkList.size(); i++ )
		{
			String linkText = linkList.get(i).getText();
			System.out.println(linkText);
			
			
		}
		
	}

}
