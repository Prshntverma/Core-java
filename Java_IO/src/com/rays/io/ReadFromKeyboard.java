package com.rays.io;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class ReadFromKeyboard {
  public static void main(String[] args) throws IOException {
	  
  PrintWriter out = new PrintWriter(new FileWriter("D://IO//temp.txt"));
    System.out.println("start writing your text here....");
    
    InputStreamReader kb = new InputStreamReader(System.in); //Keyboard input ko bytes se characters me convert karta hai.
    
    BufferedReader br = new BufferedReader(kb);// Keyboard se line-by-line text read karta hai.
    
    String line = br.readLine();
    
    while(!line.equals("close")) { // program jab saved hogaa jab aap close type krnge terminal main....
    	out.print(line); //write line in the file
    	line = br.readLine(); // read next line
    	
    }
    br.close();
    kb.close();
    out.close();
    
  
  
 }
}

