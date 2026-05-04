package com.basic;


public class CountingObjects {	
	static int count=0;
	
	{
		count++;
	}
	
	public static void main(String[] args) {	
		CountingObjects obj=new CountingObjects();
		CountingObjects obj1=new CountingObjects();
		
		System.out.println(count);
	}

}

	