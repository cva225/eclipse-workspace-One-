package com.Frameworkbasics2.Cva;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class FirefoxLaunch extends DriverEngine {
	@Test
	public  void openFirefoxGmail() {;
	
		getter().get("https://www.gmail.com/");
//getter().findElement(arg0)
	}

}