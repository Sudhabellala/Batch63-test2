package com.FileIo;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FileDemo7 {

	public static void main(String[] args) throws IOException {
		System.out.println("main method started");
		File f = new File("C:\\javalearning\\SudhaText.txt");
		FileReader fr = new FileReader(f);
		BufferedReader br = new BufferedReader(fr);

		String line = br.readLine();

		while (line != null) {
			System.out.println(line);
			line = br.readLine();
		}

		br.close();
		fr.close();
		System.out.println("main method started");

	}

}
