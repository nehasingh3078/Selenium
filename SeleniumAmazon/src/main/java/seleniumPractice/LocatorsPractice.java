package seleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LocatorsPractice {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "/Users/neha/Downloads/Drivers/chromedriver");
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://signup.ebay.com/pa/crte?ru=https%3A%2F%2Fwww.ebay.com%2F");
		
		//driver.findElement(By.cssSelector("#gh-ug-flex > a")).click();
		driver.findElement(By.id("businessaccount-radio")).click();
		driver.findElement(By.cssSelector("#businessName")).sendKeys("Neha Dream Company Ltd.");
		driver.findElement(By.id("businessEmail")).sendKeys("zoyaneha@gmail.com");
		driver.findElement(By.id("bizPassword")).sendKeys("Krishna78#78");
		driver.findElement(By.id("showbizPassword")).click();
		Select select = new Select(driver.findElement(By.id("businessCountry")));
		select.selectByVisibleText("India");
		
		driver.findElement(By.id("bizOnlyToBuy")).click();
		driver.findElement(By.id("BUSINESS_REG_FORM_SUBMIT")).click();
		
		
		//driver.findElement(By.cssSelector("#firstname")).sendKeys("Neha");
		//driver.findElement(By.id("lastname")).sendKeys("Singh");
		//driver.findElement(By.id("Email")).sendKeys("zoyaneha8@gmail.com");
		//driver.findElement(By.id("password")).sendKeys("Krishna@78");
		//driver.findElement(By.id("showpassword")).click();
		
		
		
		//driver.close();
		
		
	}

}
