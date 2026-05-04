package com.FileIo;

//import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
//import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Employee2 implements Serializable{
	int eid=18;
	String uname="Virat";
	transient String password="Virat@123";
	
}

public class SerializationEx {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		//serialization
		Employee2 emp1=new Employee2();
		FileOutputStream fos=new FileOutputStream("C:\\javalearning\\Sudha.ser");
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		oos.writeObject(emp1);
		System.out.println("sudha");
	}
}
