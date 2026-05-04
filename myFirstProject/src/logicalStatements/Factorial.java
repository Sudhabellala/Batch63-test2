package logicalStatements;

import java.util.Scanner;

public class Factorial {
	static int f=1;
	static int fact(int num) {
		while(num!=0) {
			f=f*num;
			num--;
		}	
		return f;
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num=sc.nextInt();
		sc.close();	
		int result=fact(num);
		System.out.println("factorial: "+result);
	}

}
