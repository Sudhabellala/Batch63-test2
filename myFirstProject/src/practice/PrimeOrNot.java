package practice;

import java.util.Scanner;

public class PrimeOrNot {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number to check is it prime or not: ");
		int n = sc.nextInt();// 19

		boolean flag = true;
		for (int i = 2; i <= n / 2; i++) {
			if (n % i == 0) {
				flag = false;
				break;
			}
		}
		if (flag) {
			System.out.println("Prime");
		} else {
			System.out.println("not a prime");
		}
		sc.close();
	}

}
