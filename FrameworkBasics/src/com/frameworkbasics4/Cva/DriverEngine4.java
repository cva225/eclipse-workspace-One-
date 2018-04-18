package com.frameworkbasics4.Cva;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.seleniumhq.jetty9.server.Authentication.Failed;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

public class DriverEngine4  {
	private static WebDriver driver;
	@Parameters({"Browser"})
	@BeforeSuite
	public  void openBrowser(@Optional("chrome")String BrowserName)  {
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
	@AfterMethod
      public void resultTest(ITestResult result) throws IOException {
    	  String testCase = result.getName();
		if (ITestResult.SUCCESS==result.getStatus()){
			TakesScreenshot ts= (TakesScreenshot)DriverEngine4.getter();
			File file=ts.getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(file,new File("C:\\cva ss"));
			
			}
		else if (ITestResult.SKIP==result.getStatus()) {
			
				
					TakesScreenshot ts= (TakesScreenshot)DriverEngine4.getter();
					File file=ts.getScreenshotAs(OutputType.FILE);
					FileUtils.copyFile(file,new File("D:\\Cva Screenshots"));
					
					}
				else if (ITestResult.FAILURE==result.getStatus()) {
					
					System.out.println("test passed");
					
				}
			
		}
		
		
		
	}



