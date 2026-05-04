
package practice;

import java.util.Scanner;

//Greatest of Two numbers
public class GreatOfTwoNum {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the first number: ");
		int a=sc.nextInt();
		System.out.println("Enter the second number: ");
		int b=sc.nextInt();
		sc.close();
		
		if(a>b) {
			System.out.println(a+" is the Greatest");
		}
		else {
			System.out.println(b+" is the Greatest");
		}
		
	}

}
