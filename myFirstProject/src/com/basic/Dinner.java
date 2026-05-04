package com.basic;

public class Dinner {
	int Bill=1875;
	String TipPercentage="10%";
	int NoOfPersons=4;
	int TipAmount=(10*Bill)/100;
	int TotalAmount=Bill+TipAmount;
	int SplitAmount=TotalAmount/NoOfPersons;
	int RemainingAmount=TotalAmount-(SplitAmount*NoOfPersons);
	

	public static void main(String[] args) {
		Dinner d=new Dinner();
		System.out.println("Bill: "+d.Bill);
		System.out.println("Tip Percentage: "+d.TipPercentage);
		System.out.println("No Of Persons: "+d.NoOfPersons);
		System.out.println("TipAmount: "+d.TipAmount);
		System.out.println("TotalAmount: "+d.TotalAmount);
		System.out.println("Split Amount: "+d.SplitAmount);
		System.out.println("Remaining Amount:"+d.RemainingAmount);
		
	}

}
