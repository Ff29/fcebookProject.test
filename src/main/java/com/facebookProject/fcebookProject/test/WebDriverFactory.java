package com.facebookProject.fcebookProject.test;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;


public class WebDriverFactory {

	private static WebDriver driver = null;

	private static final String fb = "https://www.facebook.com/";
	
	

	public static void setDriver(WebDriver driver) {
		WebDriverFactory.driver = driver;
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	
	public static WebDriver getDriver() {
		return driver;
	}

	
	@BeforeClass
	public void intializeWebDriver() {
		System.setProperty("webdriver.chrome.driver", "C:\\\\ToolsQA\\JarLib\\chromedriver.exe");
		driver = new ChromeDriver();

//		System.setProperty("webdriver.gecko.driver", "C:\\\\ToolsQA\\JarLib\\geckodriver.exe");
//		driver = new FirefoxDriver();
	
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get(fb);
	}
	
	@AfterClass
	public void tearDown() {
		if(driver != null) {
			driver.manage().deleteAllCookies();
			driver.quit();
		}
	}
}
