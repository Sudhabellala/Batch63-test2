package logicalStatements;

import java.util.Scanner;

public class GetPrimeNumber {
	static boolean isPrime(int n) {
		
		boolean status=true;
		if(n==0||n==1) {
			return false;
		}
		for(int i=2;i<=n;i++) {
			if(n%i==0) {
				status=false;
				break;
			}
		}
		
		return status;
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no.of Prime numbers you want: ");
		int n=sc.nextInt();
		boolean prime=isPrime(n);
		System.out.println(prime);
		
		sc.close();
	}

}
