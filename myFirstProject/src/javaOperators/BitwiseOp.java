package javaOperators;

public class BitwiseOp {
	static int a=45;
	static int b=76;

	public static void main(String[] args) {
		System.out.println("************* & **************");
		System.out.println(a&b);
		System.out.println(45&76);
		System.out.println(87&98);
		System.out.println(43&56);
		System.out.println(65&49);
		
		System.out.println("************ | ***************");
		System.out.println(a|b);
		System.out.println(45|76);
		System.out.println(87|98);
		System.out.println(43|56);
		System.out.println(65|49);
		
		System.out.println("************ ^ ***************");
		System.out.println(a^b);
		System.out.println(45^76);
		System.out.println(87^98);
		System.out.println(43^56);
		System.out.println(65^49);
		
		System.out.println("********* Left Shift *********");
		System.out.println(a<<b);
		System.out.println(a>>b);
		System.out.println(87<<3);
		System.out.println(87>>3);
		
	}

}
