package com.rays.io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ReadAndWriteEmail {
	
	public static void main(String[] args) throws IOException {
		FileReader fr = new FileReader("D:\\IO\\emails.txt");
		FileWriter  fw = new FileWriter("D:\\IO\\Validemails.txt");
		
		BufferedReader br = new BufferedReader(fr);
		BufferedWriter bw = new BufferedWriter(fw);
		
		String email =br.readLine();
		
		while(email !=null) {
			if(email.endsWith("@gmail.com")) {
				System.out.println(email);
				bw.write(email);
				bw.newLine();
			}
		   email=br.readLine();
		}
		br.close();
		bw.close();
		
	}

}
