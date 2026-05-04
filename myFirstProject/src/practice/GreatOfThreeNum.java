package practice;

import java.util.Scanner;

//Greatest of Three numbers
public class GreatOfThreeNum {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the first number: ");
		int a=sc.nextInt();
		System.err.println("Enter the Second Number: ");
		int b=sc.nextInt();
		System.out.println("Enter the Third Number: ");
		int c=sc.nextInt();
		sc.close();
		
		if((a>b)&&(a>c)) {
			System.out.println(a+" is the Greatest Number");
		}
		if((b>a)&&(b>c)) {
			System.out.println(b+" is the Greatest Number");
		}
		if((c>a)&&(c>b)) {
			System.out.println(c+" is the Greatest Number");
		}
		
	}

}
