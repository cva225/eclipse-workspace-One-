package com.Frameworkbasics2.Cva;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class ChromeLaunch extends DriverEngine  {
	@Test
	public  void openChromeFB() {
		getter().get("https://www.facebook.com/");
		

	}

}
