package com.Frameworkbasics3.Cva;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class TestTwoGmail extends DynamicBtowserLaunching {
	@Test
	public  void openChromeFB() {
		
		getter().get("https://www.gmail.com/");
		//getter().findElement(By.id("ident"));

	}
}
