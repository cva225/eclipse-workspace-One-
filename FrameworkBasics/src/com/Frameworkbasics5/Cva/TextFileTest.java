package com.Frameworkbasics5.Cva;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class TextFileTest {

	public static void main(String[] args) throws IOException {
		File f= new File("C:\\Users\\HP\\eclipse-workspace\\FrameworkBasics\\src\\TextFile.txt");
	 boolean b= f.createNewFile();
	 
		if (b) {
			System.out.println("file is created ");
		
	}
		else {
			System.out.println("return the existing file");
		}	
		
		FileWriter fw= new FileWriter(f);
		BufferedWriter bw = new BufferedWriter(fw);
		bw.write("all is well");
		bw.newLine();
		bw.write("Cvakumar");
		bw.newLine();
		bw.write("practice ");
		bw.newLine();
		bw.write("job");
		bw.newLine();
		//bw.write(" ");
		//bw.newLine();
		
		bw.flush();
		
		int count= 0;
		FileReader fr= new FileReader(f);
		BufferedReader br= new BufferedReader(fr);
		 while (br.ready()) {
			 
			 System.out.println(br.readLine());
			 count++;
			 
			 }
	System.out.println(count);
	
	
	}

}
