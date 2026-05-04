package com.FileIo;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class FileDemo8 {

	public static void main(String[] args) throws IOException {
		System.out.println("main method started");

		FileWriter fw = new FileWriter("C:\\javalearning\\SudhaBufferedWrite.txt");
		BufferedWriter bw = new BufferedWriter(fw);
		
		bw.write(97);
		bw.newLine();
		bw.write(98);
		bw.newLine();
		bw.write('A');
		bw.newLine();
		bw.write("Hello");
		bw.newLine();
		bw.write("Hi");
		bw.newLine();
		
		bw.append("Good Day");
		
		bw.flush();
		
		System.out.println("main method ended");
		
	}

}
