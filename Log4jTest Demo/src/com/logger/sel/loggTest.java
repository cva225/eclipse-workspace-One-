package com.logger.sel;

import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.gargoylesoftware.htmlunit.WebConsole.Logger;
import com.steadystate.css.dom.Property;

public class loggTest {

	public static void main(String[] args) {
		Logger logger= Logger.getLogger(loggTest.class);
		PropertyConfigurator.configure("C:\\Users\\HP\\eclipse-workspace\\Log4jTest Demo\\log4jProperties");
		
		
		System.setProperty("webdriver.gecko.driver", "C:\\selenium\\geckodriver.exe ");
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://en-gb.facebook.com/login/");
		
	}

}
