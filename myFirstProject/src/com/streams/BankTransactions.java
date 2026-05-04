package com.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Transaction {
	String transactionID;
	String type;
	double amount;

	public Transaction(String transactionID, String type, double amount) {
		super();
		this.transactionID = transactionID;
		this.type = type;
		this.amount = amount;
	}

}

public class BankTransactions {

	public static void main(String[] args) {
		List<Transaction> transactions = Arrays.asList(new Transaction("T1", "Credit", 25000),
				new Transaction("T2", "Credit", 5000), new Transaction("T3", "Dedit", 7000),
				new Transaction("T4", "Credit", 12000));

		List<Transaction> validCredits = transactions.stream().filter(t -> t.type.equals("Credit"))
				.filter(t -> t.amount > 10000).collect(Collectors.toList());
		
		System.out.println("Valid Credits: ");
		validCredits.forEach(t -> System.out.println(t.transactionID+ "->" + (int)t.amount));
		
		double totalCredit = validCredits.stream()
                .map(t -> t.amount)
                .reduce(0.0, Double::sum);

        System.out.println("Total Credit: " + (int) totalCredit);
	}

}
