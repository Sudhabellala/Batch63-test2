package Javalangfundamentals;

import java.util.Scanner;

public class DemoScanner {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Your Name: ");
		String name=sc.nextLine();
		System.out.println("Enter your age: ");
		int age =sc.nextInt();
		System.out.println("Enter Phone Number: ");
		long ph_no=sc.nextLong();
		sc.nextLine();
		System.out.println("Enter Address: ");
		String address=sc.nextLine();
		System.out.println("Enter Gender: ");
		char Gender=sc.next().charAt(0);
		
		System.out.println("Name: "+name);
		System.out.println("Age: "+age);
		System.out.println("Phone Number: "+ph_no);
		System.out.println("Address: "+address);
		System.out.println("Gender: "+Gender);
		sc.close();
		
	}

}
