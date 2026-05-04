package javaOperators;

import java.util.Scanner;

public class Arithmetic {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number: ");
		int a = sc.nextInt();
		System.out.println("Enter another number: ");
		int b=sc.nextInt();
		
		System.out.println("Sum of the two numbers is: "+(a+b));
		System.out.println("Subtraction of the two numbers is: "+(a-b));
		System.out.println("multiplication of the two numbers is: "+(a*b));
		System.out.println("Division of the two numbers is: "+(a/b));
		System.out.println("Reminder of the two numbers is: "+(a%b));
		sc.close();
	}

}
