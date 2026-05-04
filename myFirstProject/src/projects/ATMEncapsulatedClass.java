package projects;

public class ATMEncapsulatedClass {
	private String AccountHolderName;
	private String AccountNumber;
	private double balance;
	private int pin;

	public ATMEncapsulatedClass() {
	}

	public ATMEncapsulatedClass(String AccountHolderName, String AccountNumber, double balance, int pin) {
		this.AccountHolderName = AccountHolderName;
		this.AccountNumber = AccountNumber;
		this.balance = balance;
		this.pin = pin;
	}

	public String getAccountHolderName() {
		return AccountHolderName;
	}

	public void setAccountHolderName(String accountHolderName) {
		AccountHolderName = accountHolderName;
	}

	public String getAccountNumber() {
		return AccountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		AccountNumber = accountNumber;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public int getPin() {
		return pin;
	}

	public void setPin(int pin) {
		this.pin = pin;
	}
}
