package com.rays.io;

import java.io.FileWriter;
import java.io.IOException;

public class WriteTextFile {
 public static void main(String[] args) throws IOException {

		FileWriter file = new FileWriter("D:\\IO\\java.txt");  // if file not exist then Filewriter create the file 
		
		file.write("System.out.println();");
		
		System.out.println("text data write successfully.....");
		//System.out.println("System.out.println();");
		
		file.close();
}
	
}
