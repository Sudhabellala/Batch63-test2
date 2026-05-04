package com.FileIo;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class DeserializeExample {
    public static void main(String[] args) {
        try {
            FileInputStream fis = new FileInputStream("student.ser");
            ObjectInputStream ois = new ObjectInputStream(fis);

            Student s2 = (Student) ois.readObject();

            ois.close();
            fis.close();

            System.out.println("ID: " + s2.id);
            System.out.println("Name: " + s2.name);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
