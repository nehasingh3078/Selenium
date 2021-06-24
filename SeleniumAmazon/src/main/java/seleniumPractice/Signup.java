package seleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Signup {
	public static void main(String[] args) {
		// declaration and instantiation of objects/variables
		// System.setProperty("webdriver.gecko.driver","path");
		// WebDriver driver = new FirefoxDriver();
		// comment the above 2 lines and uncomment below 2 lines to use Chrome
		System.setProperty("webdriver.chrome.driver", "/Users/neha/Downloads/Drivers/chromedriver");
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		//Browser Specific Command: Maximizing the Window
		driver.manage().window().maximize();
		
		//Browser Specific Command:Delete AllCookies
		driver.manage().deleteAllCookies();
		
		//Browser Specific Command: launch Chrome and direct it to the Base URL
		driver.get("https://www.amazon.in");
		//click on Signup using xpath
		driver.findElement(By.id("nav-link-accountList-nav-line-1")).click();
		driver.findElement(By.id("createAccountSubmit")).click();
		//driver.findElement(By.xpath("//div[@class='a-column a-span8 a-span-last']")).click();
		driver.findElement(By.id("ap_customer_name")).sendKeys("Krishna Singh");
		driver.findElement(By.id("ap_phone_number")).sendKeys("6678678678");
		driver.findElement(By.id("ap_email")).sendKeys("test@testselenium.com");
		driver.findElement(By.id("ap_password")).sendKeys("Krishna@78");
		driver.findElement(By.id("continue")).click();
		
		
		//driver.close();
	
	}

}
