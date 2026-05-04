package logicalStatements;

import java.util.Scanner;

public class Marks {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your marks percentage:");
		double marksP=sc.nextDouble();
		
		if(marksP>100||marksP<0) {
			System.out.println("Invalid marks Percentage");
		}else if(marksP>=90) {
			System.out.println("Grade A");
		}else if(marksP>=80) {
			System.out.println("Grade B");
		}else if(marksP>=70) {
			System.out.println("Grade C");
		}else if(marksP>=60) {
			System.out.println("Grade D");
		}else if(marksP>=35) {
			System.out.println("Just Passed");	
		}
		sc.close();
		
	}
		

}
