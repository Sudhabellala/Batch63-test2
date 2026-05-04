package projects;

import java.util.Scanner;

public class ATMClass implements ATMInterface {
	private ATMEncapsulatedClass account;
	Scanner sc = new Scanner(System.in);

	// Constructor injection
	public ATMClass(ATMEncapsulatedClass account) {
		this.account = account;
	}

	@Override
	public void CheckBalance() {
		System.out.println("Your Current Balance is: ₹" + account.getBalance());
	}

	@Override
	public void Deposit() {
		System.out.print("Enter amount to deposit: ");
		double amount = sc.nextDouble();

		if (amount <= 0) {
			System.out.println("Invalid amount!");
		} else {
			account.setBalance(account.getBalance() + amount);
			System.out.println("Amount Deposited Successfully!");
			System.out.println("Updated Balance: ₹" + account.getBalance());
		}
	}

	@Override
	public void Withdraw() {
		System.out.print("Enter amount to withdraw: ");
		double amount = sc.nextDouble();

		if (amount <= 0) {
			System.out.println("Invalid amount!");
		} else if (amount > account.getBalance()) {
			System.out.println("Insufficient balance!");
		} else {
			account.setBalance(account.getBalance() - amount);
			System.out.println("Please collect your cash.");
			System.out.println("Remaining Balance: ₹" + account.getBalance());
		}
	}

	@Override
	public void ChangePin() {
		System.out.print("Enter current PIN: ");
		int oldPin = sc.nextInt();

		if (oldPin != account.getPin()) {
			System.out.println("Incorrect PIN!");
			return;
		}

		System.out.print("Enter new PIN: ");
		int newPin = sc.nextInt();
		System.out.print("Re-enter new PIN: ");
		int confirmPin = sc.nextInt();

		if (newPin == confirmPin) {
			account.setPin(newPin);
			System.out.println("PIN changed successfully!");
		} else {
			System.out.println("PIN mismatch!");
		}
	}

}
