package logicalStatements;

import java.util.Scanner;

public class Morning {

	public static void main(String[] args) {
		System.out.println("main method started ");
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter some text ");
		String text=sc.next();
		sc.close();
		
		if(text.contains("morning")){
			System.out.println("Hello guys, Good morning, Have a good day");
		}
		System.out.println("main method ended ");
		
	}

}
