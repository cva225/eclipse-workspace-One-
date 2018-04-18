package com.selenium.basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class SampleClass {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver.exe");
		WebDriver d= new ChromeDriver();
		d.get("https://www.gmail.com/");
		
		d.get("https://www.gmail.com/");
		d.get("https://www.gmail.com/");
		d.get("https://www.gmail.com/");
	//d.findElement(By.xpath(""));
		
	}

}
