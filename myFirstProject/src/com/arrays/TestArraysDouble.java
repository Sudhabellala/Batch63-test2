package com.arrays;

public class TestArraysDouble {

	public static void main(String[] args) {
		System.out.println("main method started ");
		
		//Declaration
		double[] ages;
		
		//creation
		ages=new double[5];
		
		//Initialization
		ages[0]=21.5;
		ages[1]=23.5;
		ages[2]=24.5;
		ages[3]=25.5;
		ages[4]=26.5;
		
		//Representation
//		for(int i=0;i<ages.length;i++) {
//			System.out.println(ages[i]);
//		}
		
		for(double age:ages) {
			System.out.println(age);
		}
		
		
		//System.out.println(ages[0]);
		//System.out.println(ages[1]);
		
		
		
	}
}
