package Javalangfundamentals;

public class SquareNumber {
	int square(int n) {
		return n*n;
	}

	public static void main(String[] args) {
		SquareNumber s=new SquareNumber();
		int result=s.square(9);
		System.out.println("Square of the given number is "+result);	
	}

}
