package com.Frameworkbasics2.Cva;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class DriverEngine {
	private static WebDriver driver;
	
	@Parameters({"Browser"})
	@BeforeSuite
	public  void openBrowser(@Optional("chrome")String BrowserName) {
		if (BrowserName.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\eclipse-workspace\\FrameworkBasics\\drivers\\chromedriver.exe");
		driver =new ChromeDriver();
		//manage();
	        }
		else if (BrowserName.equalsIgnoreCase("firefox")) {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\HP\\eclipse-workspace\\FrameworkBasics\\drivers\\geckodriver.exe");
		driver=new FirefoxDriver();
		//manage();
		
            }      
		else if (BrowserName.equalsIgnoreCase("ie")) {
		System.setProperty("webdriver.ie.driver", "C:\\Users\\HP\\eclipse-workspace\\FrameworkBasics\\drivers\\IEDriverServer.exe");;
		driver=new InternetExplorerDriver();
		//manage();
		/*driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);*/
		
		}
	}
	@BeforeMethod
	public  void manage() {
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

	}
	
	public static WebDriver  getter() {
		return driver;

	}
	@AfterSuite
	public  void close() {
		driver.close();

	}
	

}
