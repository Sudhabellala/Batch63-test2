package practice;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a string: ");
		String str=sc.nextLine();
		
		char[] arr=str.toCharArray();
		StringBuilder rev = new StringBuilder();
		
		for(int i=0;i<arr.length;i++) {
			rev.insert(0,arr[i]);
		}
		System.out.println(rev);
		sc.close();
	}

}
