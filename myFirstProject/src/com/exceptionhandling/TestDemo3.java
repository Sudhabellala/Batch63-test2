package com.exceptionhandling;

import java.util.Scanner;

public class TestDemo3 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		
		try {
			System.out.println("in try!!");
			System.out.println(10/a);
		}catch(Exception e) {
			System.out.println("in catch");
			System.out.println(10/a);
		}finally {
			System.out.println("in finally");
		}
		System.out.println("main method ended1 !");
		sc.close();
		System.out.println("main method ended2 !");
	}

}
