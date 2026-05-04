package com.DSA;

import java.util.Scanner;

public class TestDSADemo02 {
	
	static int search(int[] arr, int key) {
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==key) {
				return i;
			}
		}
		return -1;
	}
	

	public static void main(String[] args) {
		int[] arr= {18,45,4,35,33,7,10};
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a key: ");
		int key=sc.nextInt();
		
		System.out.println("key index is: "+search(arr,key));
		sc.close();
	}

}
