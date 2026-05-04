package Javalangfundamentals;

import java.util.Scanner;

public class Amount {
	
	int getThousands(int amount){
		int thousands=amount/1000;
		System.out.println("no.of 1000s need: "+thousands);
		return thousands;
	} 
	
	int getHundreds(int amount){
		amount=amount%1000;
		int hundreds=amount/100;
		System.out.println("no.of 100s need: "+hundreds);
		return hundreds;
	}
	
	int getTens(int amount){
		amount=amount%100;
		int tens=amount/10;
		System.out.println("no.of 10s need: "+tens);
		return tens;
	}
	
	int getOnes(int amount){
		amount=amount%10;
		int ones=amount/1;
		System.out.println("no.of 1s need: "+ones);
		return ones;	
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Amount: ");
		int amount=sc.nextInt();
		
		Amount a=new Amount();
		a.getThousands(amount);
		a.getHundreds(amount);
		a.getTens(amount);
		a.getOnes(amount);
		sc.close();	
	}

}
