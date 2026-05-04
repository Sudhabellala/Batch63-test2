package Javalangfundamentals;

public class BankAccount {
	double Balance=1000;
	String Name="Sudha";

	
	void deposite(double Amount) {
		Balance=Balance+Amount;
		System.out.println("After Deposite the Amount is: "+Balance);
		
	}
	
	void withdraw(double Amount) {
		Balance=Balance-Amount;
		System.out.println("After Withdraw the Amount is: "+Balance);
		
	}
	
	void checkBalance() {
		System.out.println("Balance Amount: "+Balance);
		
	}
	public static void main(String[] args) {
		
		BankAccount b=new BankAccount();
		System.out.println("Name: "+b.Name);
		b.deposite(500);
		b.withdraw(300);
		b.checkBalance();
		
	}

}
