package com.Frameworkbasics3.Cva;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.Frameworkbasics2.Cva.DriverEngine;

public class ScreenshotUtility {
	public static void screenShot() throws IOException
    {
		TakesScreenshot takesScreenshot = (TakesScreenshot)
				DynamicBtowserLaunching.getter();
		File file = takesScreenshot.getScreenshotAs(OutputType.FILE);
	
    }

}
