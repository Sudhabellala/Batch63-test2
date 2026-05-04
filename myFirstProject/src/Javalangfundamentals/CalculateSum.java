package Javalangfundamentals;

public class CalculateSum {
	
	int addition(int x,int y) {
		int sum=x+y;
		return sum;
	}

	public static void main(String[] args) {
		CalculateSum c=new CalculateSum();
		int s=c.addition(50, 30);	
		System.out.println("Sum of the numbers: "+s);
	}

}
