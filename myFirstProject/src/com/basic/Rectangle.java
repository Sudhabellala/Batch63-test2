package com.basic;

public class Rectangle {
	int length;
	int width;
	public Rectangle(int l,int w) {
		length =l;
		width =w;
	}
	public int calculateArea() {
		return length*width;
	}
		
	public boolean isSquare() {
		return length==width;
	}
	public static void main(String[] args) {
		Rectangle rect1=new Rectangle(10,20);
		Rectangle rect2=new Rectangle(15,15);
		System.out.println("Rectangle 1:");
		System.out.println("Area: "+rect1.calculateArea());
		System.out.println("is Square: "+rect1.isSquare());
		
		System.out.println("Rectangle 2:");
		System.out.println("Area: "+rect2.calculateArea());
		System.out.println("is Square: "+rect2.isSquare());
		
	}

}
