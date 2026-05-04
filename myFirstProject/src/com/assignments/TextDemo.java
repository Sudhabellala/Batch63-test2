package com.assignments;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class TextDemo {

	public static void main(String[] args) throws IOException {
		File f=new File("C:\\javalearning\\SudhaText.txt");
		f.createNewFile();
		try {
			FileReader fr=new FileReader(f);
			int i=fr.read();
			
			while(i!=-1) {
				System.out.print((char)i);
				i=fr.read();
				Thread.sleep(100);
			}
			
			
		}catch(Exception e){
			System.out.println(e.toString());
		}
	}

}
