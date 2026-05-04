package logicalStatements;

public class PrintingTen {
	void method(int a) {
		if(a<=0) {
			return;
		}
		System.out.println("Java is Simple");
		method(--a);
	}

	public static void main(String[] args) {
		PrintingTen p=new PrintingTen();
		p.method(10);
		
	}
}

