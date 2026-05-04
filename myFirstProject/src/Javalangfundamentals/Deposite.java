package Javalangfundamentals;

public class Deposite {
	double balance=5000;
	
	void depositeAmmount(double Amount) {
		balance += Amount;
		System.out.println("Deposited "+Amount+" Current Balance is: "+balance);

	}

	public static void main(String[] args) {
		Deposite d=new Deposite();
		d.depositeAmmount(1500);
	}

}
