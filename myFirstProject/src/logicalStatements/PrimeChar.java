package logicalStatements;

public class PrimeChar {

	public static void main(String[] args) {
		
		for(int i=1;i<=26;i++) {
			if(isPrime(i)) {
				System.out.println((char)(i+64));
			}
		}
		
	}
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
}

