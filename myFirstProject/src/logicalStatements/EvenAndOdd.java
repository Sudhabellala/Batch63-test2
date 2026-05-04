package logicalStatements;

public class EvenAndOdd {
	static int i;
	static int n=1200;
	
	static void findEven() {
		for(i=1000;i<=n;i++) {
			if(i%2==0) {
				System.out.println(i);
			}
		}
	}
	
	static void findOdd() {
		System.out.println("****************************");
		for(i=1000;i<=n;i++) {
			if(i%2==1) {
				System.out.println(i);
			}
		}
	}

	public static void main(String[] args) {
		findEven();
		findOdd();
	}
}
