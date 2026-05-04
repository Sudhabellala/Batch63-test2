package practice;

import java.util.Scanner;

public class OddOrNot {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a  number: ");
		int a=sc.nextInt();
		sc.close();
		
		if(a%2!=0) {
			System.out.println(a+" is an Odd Number");
		}
		else {
			System.out.println(a+" is not an Odd Number");
		}
		
	}

}
