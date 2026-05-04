package logicalStatements;

public class PrimeInGivenNum {
	
	public static boolean isPrime(int n) {
		if(n<=1) {
			return false;
		}
		for (int i=2;i<n;i++) {
			if(n%i==0) {
				return false;
			}
		}
		return true;
		
	}

	public static void main(String[] args) {
		int num=13172579;
		int temp=num;
		int temp1=num;
		int d=10;
		
		while(temp1!=0) {
	
		while(temp>d/10) {
			int r=temp%d;	
			if(isPrime(r)) {
				System.out.println("prime number:"+ r);	
			}
			temp=temp/10;
		}
		System.out.println("******************************");
		temp1=temp1/10;
		d=d*10;
		temp=num;
		}
		
	}

}
