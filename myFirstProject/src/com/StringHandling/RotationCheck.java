package com.StringHandling;

import java.util.Scanner;

public class RotationCheck {
    public static void main(String[] args) {
    		Scanner sc=new Scanner(System.in);
    		System.out.println("Enter a String: ");
    		String s1=sc.nextLine();//abcd
    		System.out.println("Enter another String: ");
    		String s2=sc.nextLine();//cdab
    		sc.close();

        boolean result = isRotation(s1, s2);
        System.out.println(result);
    }

    static boolean isRotation(String s1, String s2) {
        if (s1.length() != s2.length()) {
            return false;
        }
        String temp = s1 + s1;

        return temp.contains(s2);
    }
}
