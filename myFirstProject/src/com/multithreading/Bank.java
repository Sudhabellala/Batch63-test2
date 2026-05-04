package com.multithreading;

import java.util.Scanner;

class Balance{
	double bal=10000.00;
	void withdraw(int amount){
		if(bal>=amount) {
			bal-=amount;
			System.out.println(bal);
			
		}
		else {
			System.out.println("Insufficient balance..");
		}
	}
	
}

public class Bank {
	
	

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		
	}

}
