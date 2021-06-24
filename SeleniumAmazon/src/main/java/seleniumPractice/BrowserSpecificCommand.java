package seleniumPractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserSpecificCommand {

	public static void main(String[] args) {
		// declaration and instantiation of objects/variables
		// System.setProperty("webdriver.gecko.driver","path");
		// WebDriver driver = new FirefoxDriver();
		// comment the above 2 lines and uncomment below 2 lines to use Chrome
		System.setProperty("webdriver.chrome.driver", "/Users/neha/Downloads/Drivers/chromedriver");
//		Class<? extends WebDriver> driverClass = ChromeDriver.class;
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		//Browser Specific Command: Maximizing the Window
		driver.manage().window().maximize();
		
		//Browser Specific Command:Delete AllCookies
		driver.manage().deleteAllCookies();
		
		//Browser Specific Command: launch Chrome and direct it to the Base URL
		driver.get("https://www.amazon.in");
		
		//Browser Specific Command: GetTitle
		String title = driver.getTitle();
		System.out.println(title);
		String currenturl = driver.getCurrentUrl();
		System.out.println(currenturl);
		String pageSource = driver.getPageSource();
		System.out.println(pageSource);
		driver.close();
		
		driver.quit();
	}

}
