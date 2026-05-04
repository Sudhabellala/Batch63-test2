package com.basic;

public class Gcmannually {
	@Override
	protected void finalize() throws Throwable {
		System.out.println("Finalize started");
		
	}
	
	public static void main(String[] args) {
		System.out.println("main method started");
		
		Gcmannually g1=new Gcmannually();
		Gcmannually g2=new Gcmannually();
		Gcmannually g3=new Gcmannually();
		Gcmannually g4=new Gcmannually();
		
		g1=null;
		
		Gcmannually g5=new Gcmannually();
		
		g5=g2;
		
		System.gc();
		
		System.out.println(g1);
		System.out.println(g2);
		System.out.println(g3);
		System.out.println(g4);
		System.out.println(g5);
		
	}

}
