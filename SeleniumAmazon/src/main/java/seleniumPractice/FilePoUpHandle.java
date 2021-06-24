package seleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FilePoUpHandle {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "/Users/neha/Downloads/Drivers/chromedriver");
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://html.com/input-type-file/");
		
		//driver.findElement(By.xpath("//input[@id='fileupload']")).sendKeys("/Users/neha/Desktop/Sample.png");
		driver.findElement(By.id("fileupload")).sendKeys("/Users/neha/Desktop/Sample.png");
		
		System.out.println("File selected");
		//driver.close();
		
}
		
}
