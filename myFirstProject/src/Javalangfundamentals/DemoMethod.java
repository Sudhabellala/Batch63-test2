package Javalangfundamentals;

public class DemoMethod {
	static int a=addition();
	
	static int addition() {
		int sum;
		sum=100+200;
		return sum;
	}
	
	static String getName() {
		String s;
		s="Sudha";
		return s;
	}
	
	static String b=getName();

	public static void main(String[] args) {
		
		System.out.println("Addition: "+a);
		System.out.println("Name: "+b);

	}

}
