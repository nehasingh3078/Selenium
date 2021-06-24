package seleniumPractice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CustomXpath {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "/Users/neha/Downloads/Drivers/chromedriver");
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		
		driver.get("http://www.half.ebay.com");
		
		driver.findElement(By.linkText("Sign in")).click();
		
		
		//absolute xpath: not recommended
		//driver.findElement(By.xpath("//*[@id=\"gh-ac\"]")).sendKeys("Watches");
		//driver.findElement(By.xpath("//input[@class=gh-tb ui-autocomplete-input ui-autocomplete-loading")).sendKeys("Watches");
		//driver.findElement(By.xpath("//input[@name=_nkw")).sendKeys("Watches");
		//driver.findElement(By.xpath("//input[@id=gh-ac")).sendKeys("Watches");

		//Dynamic Id: input
		//id = test123
		//id = test_789
		//By.id("test_789")
		
		//starts-with 
		//id= 'test_123'
		//id = 'test_'
		
		//driver.findElement(By.xpath("//input[contains(@id,'test_')]").sendKeys("test");		
		//driver.findElement(By.xpath("//input[starts-with(@id,'test_')]").sendKeys("test");
		//driver.findElement(By.xpath("//input[ends-with(@id,'_test')]").sendKeys("test");	
		
		//for links: custom xpath
		//all the links are represented by <a> html
		//driver.findElement(By.xpath("//a[contains(text(), 'My Account')]")).click();
		
		
		
		//driver.close();
	}

}
