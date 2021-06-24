package seleniumPractice;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AlertPopUpHandle {
	
public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "/Users/neha/Downloads/Drivers/chromedriver");
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.rediffmail.com");
		
		driver.findElement(By.linkText("Sign in")).click();
		
		driver.findElement(By.name("proceed")).click();
		
		Thread.sleep(5000);
		
		Alert alert = driver.switchTo().alert();
		
		Thread.sleep(2000);
		
		System.out.println(alert.getText());
		
		//Test case
		String alertText = alert.getText();
		if (alertText.equals("Please enter a valid user name")) {
			System.out.println(true);
		}
		else {System.out.println(false); 
		}
		
		
		//To click on Ok button on alert pop-up
		alert.accept();
		
		//To clico on cancel button on alert popup
		//alert.dismiss(); 
		
		driver.close();
		driver.quit();

}
}