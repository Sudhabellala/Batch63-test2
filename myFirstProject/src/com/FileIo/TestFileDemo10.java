package com.FileIo;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

class Test{
	
}

public class TestFileDemo10 {

	public static void main(String[] args) throws FileNotFoundException {
		PrintWriter pw = new PrintWriter("C:\\javalearning\\SudhaPrintWrite.txt");
		
		Test t=new Test();
		pw.println();
		pw.println("Good morning have a nice day");
		pw.println(false);
		pw.println(true);
		pw.println(100);
		pw.println(100);
		pw.println(t);
		pw.println(895879784378334L);
		pw.println(98.86);
		
		pw.flush();
		pw.close();

	}

}
