package javaOperators;

public class LogicalOp {
	static int a=10;
	static int b=20;
	

	public static void main(String[] args) {
		
		System.out.println("************ && *************");
		System.out.println(a>b && b>a);
		System.out.println(a>b && b<a);
		System.out.println(a<b && b>a);
		System.out.println(a<b && b<a);
		
		System.out.println("************ || *************");
		System.out.println(a>b || b>a);
		System.out.println(a>b || b<a);
		System.out.println(a<b || b>a);
		System.out.println(a<b || b<a);
		
		System.out.println("************** ! **************");
		System.out.println(!(100>10));
		
	}

}
