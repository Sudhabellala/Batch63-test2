package logicalStatements;

import java.util.Scanner;

public class MagicNumber {
	static int r;
	 
	static int isMagicNumber(int num) {
		r=0;
		int n1=num;
		while(num>9) {
			num=n1;
			 int sum=0;

		while(num!=0) {
			r=num%10;
			num=num/10;
			sum=sum+r;
		}
		n1=sum;
		}
		return n1;
	}

	

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a nUmber: ");
		int num=sc.nextInt();
		sc.close();
		int sum=isMagicNumber(num);
		if(sum==1) {
			System.out.println("The given number is Magic NUmber");
		}
		else {
			System.out.println("The given number is not a Magic Number");
		}
	}

}
