package Javalangfundamentals;

public class DataTypes1 {

	byte b;
	short s;
	int i;
	long l;
	char c;
	float f;
	double d;
	
	
	void method1() {
		
		b=127;
		s=256;
		i=33546;
		l=65534425;
		c='s';
		f=2.356354F;
		d=3.63473246343232;
		
	}
	
	void method2() {
		System.out.println("byte value: "+b);
		System.out.println("short value: "+s);
		System.out.println("int value: "+i);
		System.out.println("long value: "+l);
		System.out.println("char value: "+c);
		System.out.println("float value: "+f);
		System.out.println("double value: "+d);
			
	}

	public static void main(String[] args) {
		DataTypes1 x=new DataTypes1();
		x.method1();
		x.method2();
	}

}
