package com.rays.io;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class MergedFile {
	public static void main(String[] args) throws IOException {
		FileWriter fw = new FileWriter("D://IO//MergedFile.txt");
		
//		for(int i =1;i<=4;i++) {
//		BufferedReader br = new BufferedReader(new FileReader("D://IO//SplitFile.txt"));	
//		String line;
//		
//
//		while ((line = br.readLine()) != null){
//			FileWriter fw = new FileWriter("D://IO//Split" + i + ".txt");
//			fw.write(line);
//			fw.close();
//			System.out.println("File Split" + i + ".txt created");
//			i++;
//		}
		
		for (int i = 1; i <= 4; i++) {

			BufferedReader br = new BufferedReader(new FileReader("D://IO//Split" + i + ".txt"));
			String line;
			while ((line = br.readLine()) != null) {
				fw.write(line);
		       	fw.write("\n");
			}
			br.close();
		}
	}

		
}
	