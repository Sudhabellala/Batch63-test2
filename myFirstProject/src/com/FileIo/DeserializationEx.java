package com.FileIo;

import java.io.FileInputStream;
//import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
//import java.io.ObjectOutputStream;
import java.io.Serializable;

class Employee1 implements Serializable {
	
	private static final long serialVersionUID = 1L;
	int eid = 18;
	String uname = "Virat";
	transient String password = "Virat@123";

}

public class DeserializationEx {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		FileInputStream fis = new FileInputStream("C:\\\\javalearning\\\\Sudha.ser");
		ObjectInputStream ois = new ObjectInputStream(fis);
		Employee1 emp2 = (Employee1) ois.readObject();
		System.out.println(emp2);
		System.out.println(emp2.eid);
		System.out.println(emp2.uname);
		System.out.println(emp2.password);
	}
	
}
