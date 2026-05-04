package practice;

import java.util.Scanner;

public class FactorialOfNum {

	static int findFactorial(int n) {
		if (n == 0 || n == 1) {
			return 1;
		} else {
			return n * findFactorial(n - 1);
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number to find factorial: ");
		int n = sc.nextInt();
		System.out.println(findFactorial(n));;
		sc.close();
	}

}
