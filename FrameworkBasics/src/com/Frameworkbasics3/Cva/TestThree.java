package com.Frameworkbasics3.Cva;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class TestThree extends DynamicBtowserLaunching {
	@Test
	public  void openChromeBing() {
		
		getter().get("https://www.bing.com/");
		getter().findElement(By.id("ident"));

	}
}
