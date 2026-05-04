package javaOperators;

public class Swap {
	static int a=20;
	static int b=10;
	static int c;
	
	public static void main(String[] args) {
		a=a^b;
		b=a^b;
		a=a^b;
		
		//System.out.println(a);
		System.out.println("a: "+a);
		System.out.println("b: "+b);
		
	}

}
