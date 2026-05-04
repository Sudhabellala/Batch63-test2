package practice;

import java.util.Scanner;

//Eligible to vote or not
public class EligibleToVote {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your Age: ");
		int age=sc.nextInt();
		sc.close();
		
		if(age>=18) {
			System.out.println("You are eligible to vote");
		}
		else {
			System.out.println("You are not eligible to vote");
		}
		
	}

}
