package com.assignments;

import java.util.InputMismatchException;
import java.util.Scanner;

public class VoterIdApp {

	public static void main(String[] args) throws InvalidGenderException, InvalidAgeException, InvalidInputException {
		Scanner sc=new Scanner(System.in);
		int count=0;
		System.out.println("Enter Your Name: ");
		String name=sc.next();
		System.out.println("Enter your Gender: ");
		char gender=sc.next().charAt(0);
		//char gender1=sc.next().charAt(0);
		
		if(gender=='M' || gender=='F') {
			count++;
		}else {
			throw new InvalidGenderException("Invalid Gender! Please Enter 'M' for Male or 'F' for Female.");
		}
		
		try{
			System.out.println("Enter your age: ");
			int age=sc.nextInt();
			if(age>18 || age<120) {
				count++;
			}
			if(age<=0 || age>120) {
				throw new InvalidInputException("Invalid age entered. Please enter a valid age between 0 and 120");
				
			}
			if(age<18) {
				throw new InvalidAgeException("people with above 17 years are eligible.");
			}
		}catch(InputMismatchException ie) {
			System.out.println("Invaliud Input. Please enter number only for age.");
		}
		
		
		finally {
			System.out.println("Thank You");
			sc.close();
		}
		if(count==2) {
			System.out.println("Application Successfully captured for "+name);
		}
	}

}
