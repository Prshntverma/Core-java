package com.rays.io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ReadAndWriteBinaryFile {

	public static void main(String[] args) throws IOException {

		String source = "D:\\IO\\IMG+VID\\mike.jpg";

		String target = "D:\\IO\\IMG+VID\\visuals.jpg";

		FileInputStream in = new FileInputStream(source);

		FileOutputStream out = new FileOutputStream(target);

		int i = in.read();

		while (i != -1) {

			System.out.println(i);

			out.write(i);

			i = in.read(); // important

		}

		in.close();
		out.close();

		System.out.println("successfullyyy........");
	}
}