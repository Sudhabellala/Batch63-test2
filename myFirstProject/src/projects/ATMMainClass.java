package projects;

//import java.util.ArrayList;
import java.util.Scanner;

public class ATMMainClass {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		// Creating a sample account
		ATMEncapsulatedClass ac1 = new ATMEncapsulatedClass("Sudha", "9876543210", 10000.00, 1234);
		ATMEncapsulatedClass ac2 = new ATMEncapsulatedClass("Roopa", "5738318252", 15000.00, 4321);
		ATMEncapsulatedClass ac3 = new ATMEncapsulatedClass("Kalyani", "7685432763", 20000.00, 6534);
		ATMEncapsulatedClass ac4 = new ATMEncapsulatedClass("Jyothi", "3454643218", 25000.00, 8463);
		
		// Store accounts in array
        ATMEncapsulatedClass[] arr = { ac1, ac2, ac3, ac4 };

        System.out.println("******** Welcome to Console ATM ********");

        // Ask account number
        System.out.print("Enter Account Number: ");
        String enteredAccNo = sc.next();

        // Check if account exists
        ATMEncapsulatedClass curUser = null;

        for (ATMEncapsulatedClass acc : arr) {
            if (acc.getAccountNumber().equals(enteredAccNo)) {
                curUser = acc;
                break;
            }
        }

        if (curUser == null) {
            System.out.println("Account not found!");
            sc.close();
            return;
        }

        // PIN Verification
        System.out.print("Enter PIN: ");
        int enteredPin = sc.nextInt();

        if (enteredPin != curUser.getPin()) {
            System.out.println("Incorrect PIN... Exiting!");
            sc.close();
            return;
        }

        // Pass current user to ATMClass
        ATMClass atm = new ATMClass(curUser);
		
		int choice;

		do {
			System.out.println("\n===== ATM Menu =====");
			System.out.println("1. Check Balance");
			System.out.println("2. Deposit");
			System.out.println("3. Withdraw");
			System.out.println("4. Change PIN");
			System.out.println("5. Exit");

			System.out.print("Enter your choice: ");
			choice = sc.nextInt();

			switch (choice) {
			case 1:
				atm.CheckBalance();
				break;

			case 2:
				atm.Deposit();
				break;

			case 3:
				atm.Withdraw();
				break;

			case 4:
				atm.ChangePin();
				break;

			case 5:
				System.out.println("Thank you! Visit again.");
				break;

			default:
				System.out.println("Invalid choice. Please try again.");
			}

		} while (choice != 5);

		sc.close();
	}
}
