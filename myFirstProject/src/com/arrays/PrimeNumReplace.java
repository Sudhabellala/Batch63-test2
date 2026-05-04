package com.arrays;

public class PrimeNumReplace {
	static boolean isPrime(int n) {

		if (n == 0 || n == 1) {
			return false;
		}
		for (int i = 2; i < n; i++) {
			if (n % i == 0) {
				return false;
				
			}
		}

		return true;
	}

	static int nextPrime(int n) {
		int next = n + 1;
		while (!isPrime(next)) {
			next++;
		}
		return next;
	}

	public static void main(String[] args) {
		int[][] arr = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		int prime = 2;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				if (isPrime(i + j)) {
					arr[i][j] = prime;
					int n = nextPrime(prime);
					prime = n;
				}
			}
		}

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}

	}

}
