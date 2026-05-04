package practice;

import java.util.Scanner;

public class PositiveOrNegative {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number: ");
		int a=sc.nextInt();
		sc.close();
		
		if(a==0) {
			System.out.println(a+" is neither Positive nor negative");
		}
		if(a>0) {
			System.out.println(a+" is Positive Number");
		}
		if(a<0) {
			System.out.println(a+" is negative Number");
		}
	}

}
