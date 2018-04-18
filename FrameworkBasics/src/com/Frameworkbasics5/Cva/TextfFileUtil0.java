package com.Frameworkbasics5.Cva;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class TextfFileUtil0 {

   private static File filepath;
  private static FileWriter fw;
 /*  private static
   private static**/
   
   
   public TextfFileUtil0() {
	   filepath= new File("C:\\Users\\HP\\eclipse-workspace\\FrameworkBasics\\src\\TextFileUtil.txt");
	   
   }
   
   public  void fileCreation() throws IOException {
	   
	   if (filepath!=null) {
		   filepath.createNewFile();
		   
	   }else {
		System.out.println("NPE");
	   }

}
   public  void filewriter() {
	   
	

}
   
   
	}


