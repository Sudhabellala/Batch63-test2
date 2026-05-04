package com.FileIo;

import java.io.File;
import java.io.IOException;

public class TestFileDemo4 {

	public static void main(String[] args) throws IOException {
		File f1 = new File("C:\\javalearning\\Sudha");
		System.out.println(f1.mkdir());

		File f = new File(f1, "sudha123.txt");
		f.createNewFile();

	}

}
