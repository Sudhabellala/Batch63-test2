package logicalStatements;

import java.util.Scanner;

public class CommonFact {
	static int highest;
	
	static void findFactors(int a,int b) {
		for(int i=1;i<=Math.min(a,b);i++) {
			if(a%i==0 && b%i==0) {
				System.out.println(i);
				highest=i;
			}
		}
		System.out.println("Highest Factor is: "+highest);
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a NUmber: ");
		int a=sc.nextInt();
		System.out.println("Enter another number: ");
		int b=sc.nextInt();
		
		System.out.println("Common Factors of a&b");
		findFactors(a,b);
		
		sc.close();
	}

}
