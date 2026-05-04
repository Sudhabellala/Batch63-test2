package com.Java8Features;

public class TestJ8Demo6 {

	public static void main(String[] args) {
		System.out.println("main method started !!");
		Runnable r=()-> {
			System.out.println("run method called");
			for(int i=0;i<=10; i++) {
				System.out.println("run: "+i);
			}
		};	
		Thread t=new Thread(r);
		t.start();
		
		for(int i=0;i<=10; i++) {
			System.out.println("main: "+i);
		}	
		System.out.println("main method ended !!");
	}
}