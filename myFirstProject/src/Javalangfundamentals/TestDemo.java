package Javalangfundamentals;
import java.math.BigInteger;

public class TestDemo {
	BigInteger a=new BigInteger("10");
	BigInteger b=new BigInteger("5");
	BigInteger c=new BigInteger("3");
	
	public static void main(String[] args) {
		
		TestDemo t=new TestDemo();
		
		BigInteger sum=t.a.add(t.b);
		BigInteger sub=sum.subtract(t.c);
		BigInteger mul=sub.multiply(t.c);
		BigInteger fin=mul;
		
		System.out.println("addition: "+sum);
		System.out.println("subtraction: "+sub);
		System.out.println("Multiplication: "+mul);
		System.out.println("Final Result: "+fin);
		
		
	}

}
