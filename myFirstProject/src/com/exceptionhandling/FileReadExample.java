package com.exceptionhandling;

import java.io.File;
import java.io.IOException;

public class FileReadExample {

	public static void main(String[] args) throws IOException {
		System.out.println("main method started");
		File f=new File("C:\\java\\Hello.txt");
		
		try {
			f.createNewFile();
		}catch(IOException e) {
			System.out.println(e.toString());
		}
		System.out.println("main method ended");
	}

}
