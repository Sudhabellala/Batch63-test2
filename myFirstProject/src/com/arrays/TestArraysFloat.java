package com.arrays;

public class TestArraysFloat {

	public static void main(String[] args) {
		System.out.println("main method started ");
		
		//Declaration
		float[] ages;
		
		//creation
		ages=new float[5];
		
		//Initialization
		ages[0]=21.5f;
		ages[1]=23.5f;
		ages[2]=24.5f;
		ages[3]=25.5f;
		ages[4]=26.5f;
		
		//Representation
//		for(int i=0;i<ages.length;i++) {
//			System.out.println(ages[i]);
//		}
		
		for(float age:ages) {
			System.out.println(age);
		}
		
		
		//System.out.println(ages[0]);
		//System.out.println(ages[1]);
		
		
		
	}
}
