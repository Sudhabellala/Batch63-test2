package com.FileIo;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class SerializeExample {
    public static void main(String[] args) {
        try {
        	
            Student s1 = new Student();

            FileOutputStream fos = new FileOutputStream("student.ser");
            ObjectOutputStream oos = new ObjectOutputStream(fos);

            oos.writeObject(s1);

            oos.close();
            fos.close();

            System.out.println("Object Serialized Successfully");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}