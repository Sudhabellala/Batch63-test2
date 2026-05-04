package com.loops;

public class FirstHundredPrime {
	
	static boolean isPrime(int n) {
		boolean status=true;
		
		if(n==0 || n==1) {
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
		for(int i=0;i<=100;i++) {
			
			if(isPrime(i)) {
				System.out.print(i+" ");
			}
		}
		
	}

}
