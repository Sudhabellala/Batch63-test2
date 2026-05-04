package com.assignments;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionDemo1 {

	public static void main(String[] args) {
		System.out.println("main method started");
		Scanner sc=new Scanner(System.in);
		
		try {
			System.out.println("enter a number: ");		
			int a=sc.nextInt();
			
			System.out.println("Enter b number: ");
			int b=sc.nextInt();
			int division=a/b;
			System.out.println("Division of the number is: "+division);
		}
		catch(ArithmeticException ae) {
			System.out.println("Do not enter Zeroes to proceed.");
			System.out.println(ae.toString());
		}
		catch(InputMismatchException e) {
			System.out.println("Enter Integer type data only.");
			System.out.println(e.toString());	
		}
		catch(Exception e) {
			System.out.println(e.toString());
		}
		finally {
			System.out.println("Execution completed.");
			sc.close();
		}
		
		System.out.println("main method ended.");
	}
}
