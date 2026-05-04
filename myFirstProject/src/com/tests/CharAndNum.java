package com.tests;

import java.util.Scanner;

public class CharAndNum {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a string which contains both Characters and numbers: ");
		String str=sc.nextLine();
		
		char[] c=str.toCharArray();
		
		String new_string="";
		int num=0;
		
		for(int i=0;i<=c.length-1;i++) {
			if(Character.isDigit(c[i])) {
				//num=num+c[i];
				num = num + Character.getNumericValue(c[i]);

				
			}else {
				new_string=new_string+c[i];
				
			}
			
		}
		String s=new_string+num;
		System.out.println(s);
		sc.close();
	}

}
