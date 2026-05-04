package com.FileIo;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Employee implements Serializable{
	int eid=18;
	String uname="Virat";
	transient String password="Virat@123";
	
}

public class TestFileDemo11 {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		//serialization
		Employee emp1=new Employee();
		FileOutputStream fos=new FileOutputStream("C:\\javalearning\\Sudha.ser");
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		oos.writeObject(emp1);
		
		//de-serialization
		FileInputStream fis=new FileInputStream("C:\\\\javalearning\\\\Sudha.ser");
		ObjectInputStream ois=new ObjectInputStream(fis);
		Employee emp2=(Employee)ois.readObject();
		System.out.println(emp2);
		System.out.println(emp2.eid);
		System.out.println(emp2.uname);
		System.out.println(emp2.password);
	}

}
