package seleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginFunctionality {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "Users/neha/Downloads/Drivers/chromedriver");
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.amazon.in");
		driver.findElement(By.id("nav-link-accountList-nav-line-1")).click();
		driver.findElement(By.id("ap_email")).sendKeys("zoyaneha8@gmail.com");
		driver.findElement(By.className("a-button-input")).click();
		driver.findElement(By.id("ap_password")).sendKeys("Krishna@78");
		driver.findElement(By.id("signInSubmit")).click();
		
		//Search a Macbook 
		
		//driver.findElement(By.xpath("//select[@id='searchDropdownBox']"));
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Macbook");
		
		driver.findElement(By.id("nav-search-submit-button")).click();
	
		
		driver.close();
		
		
	}
}
