package logicalStatements;

import java.util.Scanner;

public class StudentPassFail {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number of students: ");
		int n=sc.nextInt();
		
		int passCount=0,failCount=0;
		for(int i=1;i<=n;i++) {
			System.out.println("Enter marks of student "+i+": ");
			int marks=sc.nextInt();
		
			if(marks>=50) {
				passCount++;
			
			}else {
				failCount++;
			}
			
		}
		double passPercentage=(passCount*100.0)/n;
		System.out.println("No.of Students Passed: "+passCount);
		System.out.println("No.of Students Failed: "+failCount);
		System.out.println("Pass Percentage: "+passPercentage);
		
		sc.close();
	}
}

