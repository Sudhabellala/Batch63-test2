package com.assignments;

public class PaymentProcessor {
	
	void makePayment(int cardNumber,double amount) {
		if(amount<=5000) {
			System.out.println("debited");
			double discount_amount=amount*0.02;
			System.out.println("yayy! You won 2% cashback: "+discount_amount);
		}else {
			System.out.println("Insufficient Credit Limit!");
		}
	}
	
	
	void makePayment(String upiId) {
		double amount=500;
		if(upiId.contains("@upi")) {
			amount+=50;
			System.out.println("yayy! You won Rs.50 Cashback!");
			System.out.println("Now the amount is: "+amount);
			
		}else {
			System.out.println("Make payment with upi and won cashback");
		}
		
	}
	
	void makePayment(double amount) {
		if(amount>1000) {
			System.out.println("Eligible for 100 cashback coupon!");
		}else {
			System.out.println("Payment received in cash");
		}
		
	}
	public static void main(String[] args) {
		PaymentProcessor p=new PaymentProcessor();
		p.makePayment(6543,5000);
		p.makePayment("6301680692@ibl");
		p.makePayment(5000);
	}

}
