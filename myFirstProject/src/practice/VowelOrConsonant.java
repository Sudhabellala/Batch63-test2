package practice;

import java.util.Scanner;

public class VowelOrConsonant {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the alphabet: ");
		String a=sc.next();
		sc.close();
		for(int i=0;i<a.length();i++) {
			char ch=a.charAt(i);
		if(ch=='a' ||ch=='e' ||ch=='i' ||ch=='o' ||ch=='u' ||ch=='A' ||ch=='E' ||ch=='I' ||ch=='O') {
			System.out.println(a+" is a Vowel");
		}
		else {
			System.out.println(a+" is a Consonant");
		}
		
		}

	}

}
