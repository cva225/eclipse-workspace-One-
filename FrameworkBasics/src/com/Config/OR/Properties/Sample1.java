package com.Config.OR.Properties;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

//Program for Writing data to a property file

public class Sample1 {
	public static void main(String[] args) throws IOException  {
		
		
		//Write data to config file
		
		Properties  prop= new Properties();
	  FileInputStream fip =new FileInputStream("C:\\Users\\HP\\eclipse-workspace\\FrameworkBasics\\src\\com\\Config\\OR\\Properties\\Config.properties");
		prop.load(fip);
		prop.setProperty("ram", "lakshmi");
		prop.setProperty("hari", "siva");
	
		FileOutputStream fop = new FileOutputStream("C:\\Users\\HP\\eclipse-workspace\\FrameworkBasics\\src\\com\\Config\\OR\\Properties\\Config.properties");
		prop.store(fop, " Successfully Added data");
	
		//Reading the data from property file
		
		String  Name  = prop.getProperty("name");
		String password = prop.getProperty("practice");
		String defaultName = prop.getProperty("teja", "malli");
		
		System.out.println(Name);
		System.out.println(password);
		System.out.println(defaultName );//here we dont have this key  then we get default value 
		
		
		
		
		
		
		
		
		
		
		
     //write data to OR file
		
	/*Properties  prop= new Properties();
		  FileInputStream fip =new FileInputStream("C:\\Users\\HP\\eclipse-workspace\\FrameworkBasics\\src\\com\\Config\\OR\\Properties\\OR.properties");
			prop.load(fip);
			prop.setProperty("first_Name", "/input.inputtext _58mg _5dba _2ph-");
			prop.setProperty("forgot_Pwd_xpath", "//*[@linkText='Forgotten account?']");
		
			FileOutputStream fop = new FileOutputStream("C:\\Users\\HP\\eclipse-workspace\\FrameworkBasics\\src\\com\\Config\\OR\\Properties\\OR.properties");
			
			prop.store(fop, " Successfully Added data");*/
		
		
	//Reading the data from property file
		
		
		
		
		
		
	  
	}
	
	
	

}
