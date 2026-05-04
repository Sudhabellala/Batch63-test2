package com.arrays;

public class TestArraysChar {

	public static void main(String[] args) {
		System.out.println("main method started ");
		
		//Declaration
		char[] ages;
		
		//creation
		ages=new char[5];
		
		//Initialization
		ages[0]='s';
		ages[1]='u';
		ages[2]='d';
		ages[3]='h';
		ages[4]='a';
		
		//Representation
		for(int i=0;i<ages.length;i++) {
			System.out.println(ages[i]);
		}
		
//		for(char age:ages) {
//			System.out.println(age);
//		}
		
		
//		System.out.println(ages[0]);
//		System.out.println(ages[1]);
		
		
		
	}
}
