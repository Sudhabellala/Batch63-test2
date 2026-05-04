package com.exceptionhandling;

import java.io.File;
//import java.util.Scanner;
public class FileDemo {

	public static void main(String[] args) {
		System.out.println("main method started");
		File f=new File("C:\\java\\Sudha.doc");
		
		try {
			f.createNewFile();
		}
		catch(Exception e) {
			System.out.println(e.toString());
		}
		System.out.println("main method started");
	}

}
