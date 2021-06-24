package seleniumPractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CompareTitle {
	public static void main(String[] args) {
		// declaration and instantiation of objects/variables
		// System.setProperty("webdriver.gecko.driver","C:\\geckodriver.exe");
		// WebDriver driver = new FirefoxDriver();
		// comment the above 2 lines and uncomment below 2 lines to use Chrome
		System.setProperty("webdriver.chrome.driver", "/Users/neha/Downloads/Drivers/chromedriver");
//		Class<? extends WebDriver> driverClass = ChromeDriver.class;
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		String baseUrl = "https://www.amazon.in";
		String expectedTitle = "Amazon.in";
		String actualTitle = "";

		// launch Fire fox and direct it to the Base URL
		driver.get(baseUrl);

		// get the actual value of the title
		actualTitle = driver.getTitle();

		/*
		 * compare the actual title of the page with the expected one and print the
		 * result as "Passed" or "Failed"
		 */
		if (actualTitle.contentEquals(expectedTitle)) {
			System.out.println("Test Passed! " + actualTitle);
		} else {
			System.out.println("Test Failed actual title is:-> " + actualTitle);
		}

		// close Fire fox
		driver.close();
	}

}
