package javaOperators;

import java.util.Scanner;

public class TernaryOp {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter your age: ");
		int age=sc.nextInt();
		String eligibility="";
		eligibility=(age>18)?"Yes":"No";
		System.out.println("The above person is eligible or not for driving..?"+eligibility);
		
		
		String name1="Sudha";
		String name2="Rani";
		
		String maxS="";
		maxS=(name1.length()>name2.length())?name1:name2;
		System.out.println("The maximum Strings from a given String: "+maxS);
	}

}
