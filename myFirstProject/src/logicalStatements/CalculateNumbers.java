package logicalStatements;

import java.util.Scanner;

public class CalculateNumbers {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a value");
		int a=sc.nextInt();
		
		System.out.println("Enter a value");
		int b=sc.nextInt();
		int result=0;
		
		System.out.println("Enter a symbol to proceed for calculation like + - * / %: ");
		String sym=sc.next();
		
		switch(sym) {
		case "+" ->{
			System.out.println("Addition of two values");
			result=a+b;
		}
		case "-" ->{
			System.out.println("Subtraction of two values");
			result=a-b;
		}
		case "*" ->{
			System.out.println("Multiplication of two values");
			result=a*b;
		}
		case "/" ->{
			System.out.println("Quotient of two values");
			result=a/b;
		}
		case "%" ->{
			System.out.println("Reminder of two values");
			result=a%b;
		}
		default->System.out.println("Invalid symbol to proceed");
		
		}
		System.out.println("Result is: "+result);
		
		sc.close();
	}

}
