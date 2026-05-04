package Javalangfundamentals;

import java.util.Scanner;

public class AtmPin {
	
	//int rem=(n%10)*10+n/10;
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Two digit code: ");
		int n=sc.nextInt();
		int rem=(n%10)*10+n/10;
		System.out.println("The Reversed Pin is: "+rem);
		sc.close();
		
	}

}
