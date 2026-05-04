package Javalangfundamentals;

public class CheckEven {
	
	boolean isEven(int n) {
		return n%2==0;
	}

	public static void main(String[] args) {
		CheckEven c=new CheckEven();
		boolean e=c.isEven(6);
		System.out.println("The given number is "+e);
	}

}
