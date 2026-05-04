package com.DSA;

public class TestArraysDemo2 {

	public static void main(String[] args) {
		int[] n = { 10, 18, 7, 45, 4, 33, 1 };
		System.out.println(n.length);

		for (int i = 0; i < n.length; i++) {
			
			//System.out.print(n[i]+" ");
			if(n[i]%2==0) {
				System.out.print(n[i]+" ");
			}
		}
	}
}
