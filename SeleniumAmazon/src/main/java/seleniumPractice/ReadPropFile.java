package seleniumPractice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ReadPropFile {
	
	static WebDriver driver;

	public static void main(String[] args) throws IOException {
		
		
		Properties prop = new Properties();
		FileInputStream ip = new FileInputStream("/Users/neha/eclipse-workspace/SeleniumAmazon/src/main/java/seleniumPractice/config.properties");
		
		prop.load(ip);
		
		
		System.out.println(prop.getProperty("name"));
		System.out.println(prop.getProperty("age"));
		String url = prop.getProperty("url"); 
		System.out.println(url);
		
		String browserName = prop.getProperty("browser");
		
		System.out.println(browserName);
			
	
	if (browserName.equals("Chrome"))
	{
		System.setProperty("webdriver.chrome.driver", "/Users/neha/Downloads/Drivers/chromedriver");
		WebDriverManager.chromedriver().setup();
		//WebDriver driver = new ChromeDriver();
		driver = new ChromeDriver();
	}
	
	else if (browserName.equals("Firefox"))
	{
		System.setProperty("webdriver.firefox.driver", "/Users/neha/Downloads/Drivers/gechodriver");
		WebDriverManager.firefoxdriver().setup();
		//WebDriver driver = new ChromeDriver();
		driver = new FirefoxDriver();
	}
	
	else if (browserName.equals("IE"))
	{
		System.setProperty("webdriver.ie.driver", "/Users/neha/Downloads/Drivers/internetexplorerdriver");
		WebDriverManager.iedriver().setup();
		//WebDriver driver = new ChromeDriver();
		driver = new InternetExplorerDriver();
	}
	
	driver.get(url);
}
}
