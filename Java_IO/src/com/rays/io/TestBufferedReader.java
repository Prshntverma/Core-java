package com.rays.io;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class TestBufferedReader {

	public static void main(String[] args) throws IOException {

   // BufferedReader rd = new BufferedReader();
    BufferedReader file = new BufferedReader(new FileReader("D://IO//Hello.txt"));
     //buffered reader read the data line by  line
    String line = file.readLine();
    
   // System.out.println(line);  // printing only single line 
           //if uh want to print whole  data line by line then we using while loop ....
     //null isliye used kiya hai ki bufferedReader String main data leta hai 
    
    while(line != null) {
    	System.out.println(line);
    	line =file.readLine();
    }
    
    file.close();

	}

}
