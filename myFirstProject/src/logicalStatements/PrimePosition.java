package logicalStatements;

import java.util.Scanner;

public class PrimePosition {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the position: ");
		int pos=sc.nextInt();
		
		int count=0;
		int num=2;
		
		while(true) {
			if(isPrime(num)) {
				count++;
				
				if(count==pos) {
					System.out.println("The prime number is at pos "+ pos+ " and the number is "+num);
					break;
				}
			}
			num++;
			
		}
		sc.close();
	}
	public static boolean isPrime(int n) {
		if(n<=1) {
			return false;
		}
		for (int i=2;i<n;i++) {
			if(n%i==0) {
				return false;
			}
		}
		return true;
		
	}
}

