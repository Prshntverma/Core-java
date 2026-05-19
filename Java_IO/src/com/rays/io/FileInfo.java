package com.rays.io;

import java.io.File;
import java.util.Date;

public class FileInfo {

	public static void main(String[] args) {
		File f = new File("D:\\IO\\Hello.txt");
		
		
		//System.out.println(f.exists());  //return true if file exists
		
		if(f.exists()) {
			System.out.println("Name :"+f.getName());
		
		
		//path of file 
		System.out.println("Path :" + f.getAbsolutePath());
		
		//check access permission
		System.out.println("access permission");
		System.out.println("Writable:"+f.canWrite());
		System.out.println("readable:"+f.canRead());
		
		
		//check if it is a directory or a file
		System.out.println("Is File:"+f.isFile());   //check the path is file
		System.out.println("Is Directory:"+f.isDirectory());//check the path is directory means folder
		
		//last modified date of file/directory 
		Date d = new Date(f.lastModified());
		System.out.println("Date modified :"+d);
		
		//length of file 
		
		long length = f.length();
		System.out.println("Length :"+length + " bytes");
		
	 } else{
		System.out.println(" File does not exist ");
}
  }
}
