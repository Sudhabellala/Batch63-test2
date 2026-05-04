package logicalStatements;

import java.util.Scanner;

public class MovieTheatre {
	static String showType;
	static int price;
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Select a ShowTime ");
		System.out.println("1.Morning Show - 100");
		System.out.println("2.Matinee Show - 150");
		System.out.println("3.Evening Show - 200");
		System.out.println("Enter your choice (1-3):");
		int choice=sc.nextInt();
		//String showType;
		//int price;
		
		switch(choice) {
		case 1:
			showType="Morning Show";
			price=100;
			break;
		case 2:
			showType="Matinee Show";
			price=150;
			break;
		case 3:
			showType="Evening Show";
			price=200;
			break;
		default:
			System.out.println("Invalid Choice!");
			sc.close();
		}
		
		System.out.println("Enter your age: ");
		int age=sc.nextInt();
		
		double discount=0;
		double finalPrice=price;
		
		if(age<12) {
			discount=price*0.5;
			finalPrice=price-discount;	
		}
		
		System.out.println("********* Ticket Details *********");
		System.out.println("Show Type: "+showType);
		System.out.println("Price: "+price);
		System.out.println("Discount: "+discount);
		System.out.println("Final Price: "+finalPrice);
		
	}
	

}
