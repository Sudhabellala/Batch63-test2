package com.FileIo;

import java.io.FileWriter;
import java.io.IOException;

public class TestDemo6 {

	public static void main(String[] args) throws IOException {
		System.out.println("main method started");
		
		FileWriter fw=new FileWriter("C:\\javalearning\\FileWriteSudha.txt");
		
		fw.write(100);
		fw.write('\n');
		fw.write("Hello");
		fw.write("Batch63");
		fw.write('\n');
		fw.write('A');
		
		fw.flush();
		
	
		
	}

}
