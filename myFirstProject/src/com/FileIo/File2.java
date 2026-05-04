package com.FileIo;

import java.io.File;
import java.io.IOException;

public class File2 {

	public static void main(String[] args) throws IOException {
		File f = new File("C:\\javaFileIo");
		File f1 = new File(f, "Sudha2.txt");

//		System.out.println(f1.delete());

		if (!f1.exists()) {
			boolean isFileCreated = f1.createNewFile();

			if (isFileCreated) {
				System.out.println("File has been created Successfully");
			}
		} else {
			System.out.println("With this name file already exists");
		}
		System.out.println(f1.getAbsolutePath());//File
		System.out.println(f1.getCanonicalPath());//File
		System.out.println(f1.getAbsoluteFile());//File
		System.out.println(f1.getFreeSpace());
		System.out.println(f1.getTotalSpace());
		
		System.out.println("main method ended.");
	}

}
