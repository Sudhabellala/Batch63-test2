package com.exceptionhandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileDemoExample {

	public static void main(String[] args)  {
		File f=new File("C:\\java\\Hello.txt");
		
		try {
			FileReader fr=new FileReader(f);
			int i=fr.read();
			
			while(i !=-1) {
				System.out.print((char)i);
				i=fr.read();
			}
		}
		catch(FileNotFoundException e) {
			System.out.println(e.toString());
		}
		catch(IOException e) {
			System.out.println(e.toString());
		}
	}

}
