package logicalStatements;

import java.util.Scanner;

public class ChocoWrapper {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter No.of Chocolates you want to buy: ");
		int purchased=sc.nextInt();
		int freeOffer=(purchased/5)*3;
		int total_chocolates=purchased+freeOffer;
		
		int wrappers = total_chocolates;
		int free_from_wrappers=0;
		sc.close();
		
		while(wrappers>=3) {
			int newChocolates=wrappers/3;
			free_from_wrappers+=newChocolates;
			wrappers = (wrappers % 3) + newChocolates;
			
		}
		int finalTotal = total_chocolates + free_from_wrappers;
		
		System.out.println("Purchased Chocolates: " + purchased);
	    System.out.println("Free from Offer 1 (Buy 5 get 3): " + freeOffer);
	    System.out.println("Free from Wrappers: " + free_from_wrappers);
	    System.out.println("Total Chocolates Received: " + finalTotal);
	}
}
