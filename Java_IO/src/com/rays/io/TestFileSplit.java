package com.rays.io;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;

public class TestFileSplit {

	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new FileReader("D://IO//SplitFile.txt"));	
		String line;
		int i = 1;

		while ((line = br.readLine()) != null){
			FileWriter fw = new FileWriter("D://IO//Split" + i + ".txt");
			fw.write(line);
			fw.close();
			System.out.println("File Split" + i + ".txt created");
			i++;
		}

		br.close();

		System.out.println("File Split Successfully");
	}
}