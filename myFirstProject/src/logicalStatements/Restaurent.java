package logicalStatements;

import java.util.Scanner;

public class Restaurent {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Select a meal: ");
		System.out.println("1.Breakfast");
		System.out.println("2.Lunch");
		System.out.println("3.Dinner");
		System.out.println("Enter Your Choice(1-3): ");
		int choice=sc.nextInt();
		
		System.out.println("Enter your budget: ");
		int budget=sc.nextInt();
		
		switch(choice){
		case 1:
			System.out.println("\nMeal Selected: Breakfast");
			if(budget<100) {
				System.out.println("Sorry, not enough budget for this meal");
			}
			else if(budget<=200) {
				System.out.println("Basic Meal Selected");
			}
			else {
				System.out.println("Premium Meal selected");
			}
			break;
			
		case 2:
			System.out.println("\nMeal Selected: Lunch");
			if(budget<100) {
				System.out.println("Sorry, not enough budget for this meal");
			}
			else if(budget<=200) {
				System.out.println("Basic Meal Selected");
			}
			else {
				System.out.println("Premium Meal selected");
			}
			break;
			
		case 3:
			System.out.println("\nMeal Selected: Dinner");
			if(budget<100) {
				System.out.println("Sorry, not enough budget for this meal");
			}
			else if(budget<=200) {
				System.out.println("Basic Meal Selected");
			}
			else {
				System.out.println("Premium Meal selected");
			}
			break;
			
		default:
			System.out.println("Invalid Choice");
		}
		sc.close();
	}

}
