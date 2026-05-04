package logicalStatements;
import java.util.Scanner;
public class ElectricityBill {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter number of customers: ");
	    int n = sc.nextInt();
	    sc.nextLine();
		
		for (int i = 0; i < n; i++) {
		    System.out.print("Enter name: ");
		    String name = sc.next();            
		    System.out.print("Enter units: ");
		    int units = sc.nextInt();

		    int bill = calculateBill(units);
		    System.out.println(name+" -> Bill Amount: "+bill);
		    System.out.println("**********************");
		}
		sc.close();
	}
		
	static int calculateBill(int units) {
		int charge;
		if(units<=100) {
			charge=units*5;
		}else if(units>100 || units<=200){
			charge=(100*5)+(units-100)*7;
		}else {
			charge=(100*5)+(100*7)+(units-200)*10;
		}
		return charge;
	}
		
}
	


