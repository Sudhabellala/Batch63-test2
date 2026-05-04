package com.FileIo;

import java.io.File;

public class TestFileDemo3 {

	public static void main(String[] args) {
		String s = "Java is simple in VCube without a doubt when you practice";
		String[] words = s.split(" ");
		for(String word:words) {
			System.out.println(word.length());
		}

		File f = new File("C:\\javalearning");
		int count = 0;

		String[] listOfFiles = f.list();

		for (String str : listOfFiles) {
			System.out.println(str);
			count++;
		}
		System.out.println("all files count: " + count);
	}

}
