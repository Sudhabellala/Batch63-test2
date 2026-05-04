package Javalangfundamentals;

import java.util.Scanner;

public class Calculator {
	
	double getCircleArea(double r) {
		double c=0;
		c=Math.PI*r*r;
		return c;
		
	}

	double getRectangleArea(double l,double b) {
		double rec=0;
		rec=l*b;
		return rec;
		
	}
	
	double getTriangleArea(double base,double h) {
		double t=0;
		t=(base*h)/2;
		return t;
		
		
	}
	
	public static void main(String[] args) {
		
		Calculator c=new Calculator();
		
		Scanner sc=new Scanner(System.in);
		System.out.println("*************************");
		System.out.println("Enter radius value: ");
		double r=sc.nextDouble();
		System.out.println("The Area of the circle is: "+c.getCircleArea(r));
		System.out.println("*************************");
		System.out.println("Enter length of Rectangle value: ");
		double l=sc.nextDouble();
		System.out.println("Enter Breadth of Rectagle value: ");
		double b=sc.nextDouble();
		System.out.println("The Area of the Rectangle is: "+c.getRectangleArea(l,b));
		System.out.println("*************************");
		System.out.println("Enter base of the Triangle value: ");
		double base=sc.nextDouble();
		System.out.println("Enter Height of the Traingle Value: ");
		double h=sc.nextDouble();
		System.out.println("The Area of the circle is: "+c.getTriangleArea(base,h));
		sc.close();
	}

}
