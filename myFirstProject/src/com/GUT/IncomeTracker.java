package com.GUT;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class IncomeTracker {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		double totalIncome = 0;
		double totalExpenditure = 0;

		// To store expenditure category-wise
		Map<String, Double> expenses = new LinkedHashMap<>();

		while (true) {

			System.out.print("Enter income (or 'done' to finish): ");
			String incomeInput = sc.nextLine();

			if (incomeInput.equalsIgnoreCase("done")) {
				break;
			}

			double income = Double.parseDouble(incomeInput);
			totalIncome += income;

			System.out.print("Enter type of material: ");
			String material = sc.nextLine();

			System.out.print("Enter expenditure on " + material + ": ");
			double expenditure = Double.parseDouble(sc.nextLine());

			totalExpenditure += expenditure;

			// If category already exists, add to it
			expenses.put(material, expenses.getOrDefault(material, 0.0) + expenditure);
		}

		System.out.println("\n===== Summary =====");
		System.out.println("Total Income: " + totalIncome);
		System.out.println("Total Expenditure: " + totalExpenditure);

		double savings = totalIncome - totalExpenditure;
		System.out.println("Total Savings: " + savings);

		System.out.println("\nMoney Spent On:");
		for (Map.Entry<String, Double> entry : expenses.entrySet()) {
			System.out.println(entry.getKey() + " -> " + entry.getValue());
		}

		sc.close();
	}
}
