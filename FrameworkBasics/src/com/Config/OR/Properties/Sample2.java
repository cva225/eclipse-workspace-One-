package com.Config.OR.Properties;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Properties;

import com.gargoylesoftware.htmlunit.javascript.host.file.File;

public class Sample2   {
	static  Properties prop = new Properties();
	 String fileName;
	 String value;
	 
	 public   Sample2(String  fileName1) {
		fileName =fileName1; 

	}
	 
	 public  String getproperty(String key) throws IOException {
		
		FileInputStream fip = new FileInputStream(fileName);
		prop.load(fip);
		value= prop.getProperty(key);
		return value;
		} 
	 public  void setproperty() throws IOException {
	java.io.File file1 = new java.io.File(fileName);
	FileInputStream fip = new FileInputStream(file1);
	prop.load(fip);
	prop.setProperty("m", "cva");
	FileOutputStream fop = new FileOutputStream(fileName);
	prop.store(fop, null);

	}

	 public void removeProperty(String key) throws IOException {
		 java.io.File file2 = new java.io.File(fileName);
		 FileInputStream fip = new FileInputStream(file2);
		 prop.load(fip);
    prop.remove(key);
		 
		 prop.store(new FileOutputStream(fileName),null);
		

	}
}
