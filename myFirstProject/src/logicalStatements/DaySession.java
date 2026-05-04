package logicalStatements;

import java.util.Scanner;

public class DaySession {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a day: ");
		String day=sc.next();
		
		System.out.println("Enter a session: ");
		String session=sc.next();
		
		sc.close();
		
		switch(day) {
		case "Monday"->{
			System.out.println("Mondays are lazy but Srikanth sir session we should not miss");
			switch(session) {
			case "morning"->System.out.println("We shoiuld listen the classes");
			case "Afternoon"->System.out.println("Attend the labs");
			case "evening"->System.out.println("repeat the practice!");
			}
		}
		
		case "Tuesday"->System.out.println("Rotinue day");
		case "Wednesday"->System.out.println("Rotinue day");
		case "Thursday"->System.out.println("Rotinue day");
		case "Friday"->System.out.println("Rotinue day");
		case "Saturday"->{
			System.out.println("Special day in vcube will helpful for get a job");
			switch(session) {
			case "Morning"->System.out.println("We should not miss Exams ");
			case "Afternoon"->System.out.println("We should not miss mockup interviews");
			case "Evening"->System.out.println("No classes we can plan for movie");
			}
		}
		default ->System.out.println("Invalid Entry");
		
		}
	}

}
