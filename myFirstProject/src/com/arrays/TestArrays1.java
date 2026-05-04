package com.arrays;

//WAP to represent arrays with ages.
public class TestArrays1 {

	public static void main(String[] args) {
		System.out.println("main method started ");
		
		//Declaration
		int[] ages;
		
		//creation
		ages=new int[5];
		
		//Initialization
		ages[0]=21;
		ages[1]=23;
		ages[2]=24;
		ages[3]=25;
		ages[4]=26;
		
		//Representation
		for(int i=0;i<ages.length;i++) {
			System.out.println(ages[i]);
		}
		
//		for(int age:ages) {
//			System.out.println(age);
//		}
		
		
		//System.out.println(ages[0]);
		//System.out.println(ages[1]);
		
		
		
	}
}
