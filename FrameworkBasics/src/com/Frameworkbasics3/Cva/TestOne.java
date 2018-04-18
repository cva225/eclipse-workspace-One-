package com.Frameworkbasics3.Cva;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class TestOne extends DynamicBtowserLaunching{
	@Test
	public  void openChromeFB() {
		
		getter().get("https://www.facebook.com/");
		getter().findElement(By.id("siva"));

	}

}
