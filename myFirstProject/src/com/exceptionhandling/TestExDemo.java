package com.exceptionhandling;

import java.io.File;
import java.io.IOException;

public class TestExDemo {

	public static void main(String[] args) throws IOException {
		
			System.out.println("main method started ");
			hello();
		
	}
	static void hello() throws IOException {
		System.out.println("hello method");
		File f=new File("");
		f.createNewFile();
	}

}
