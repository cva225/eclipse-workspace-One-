package com.Frameworkbasics3.Cva;

public interface BrowserKeyAndValue {
	String ieKey="webdriver.ieKey.driver";
	String ieValue=System.getProperty ("user.dir")+"\\drivers";
	String chromeKey="webdriver.chrome.driver";
	String chromeValue=System.getProperty("user.dir")+"\\drivers";
	String geckoKey="webdriver.gecko.driver";
	String geckoValue=System.getProperty("user.dir")+"\\drivers";

}
