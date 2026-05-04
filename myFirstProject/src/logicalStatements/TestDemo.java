package logicalStatements;

import java.util.Scanner;

public class TestDemo {

	public static void main(String[] args) {
		System.out.println("Welcome to Vcube Matrimonial site!");
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your name");
		String name=sc.nextLine();
		
		System.out.println("Hello "+name);
		
		System.out.println("Enter the salary: ");
		double salary=sc.nextDouble();
		
		System.out.println("Enter the assets: ");
		double assets=sc.nextDouble();
		
		if(salary>=2500000.00 && assets>=50000000.00) {
			System.out.println("oh okay!");
			System.out.println();
		}else {
			System.out.println("S");
		}
		
		
	}

}
