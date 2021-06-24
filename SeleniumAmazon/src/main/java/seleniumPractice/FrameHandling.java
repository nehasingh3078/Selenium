package seleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FrameHandling {

public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "/Users/neha/Downloads/Drivers/chromedriver");
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
//		driver.get("https://www.freecrm.com/index.html");
//		driver.findElement(By.xpath("//span[normalize-space()='Log In']")).click();		
//		
//		//driver.get("https://ui.cogmento.com/");
//		driver.findElement(By.name("email")).sendKeys("zoyaneha8@gmail.com");
//		driver.findElement(By.name("password")).sendKeys("Krishna@78");
//		Thread.sleep(2000);
//		
//		driver.findElement(By.xpath("//div[@class='ui fluid large blue submit button']")).click();
//		
		driver.get("https://classic.freecrm.com/login.cfm");
		driver.findElement(By.name("username")).sendKeys("zoyaneha8@gmail.com");
		driver.findElement(By.name("password")).sendKeys("Krishna@78");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		Thread.sleep(2000);
		driver.switchTo().frame("mainpanel");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[contains(text(), 'Contacts')]")).click();
		
		// driver.close();
}
}
