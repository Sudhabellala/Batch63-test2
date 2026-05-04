package com.basic;

public class Book {
	String authorname="Ravi Mantri";
	double price=700;
	String BookTitle="Amma diary lo konni pageelu";
	float discount=(5*700)/100;
	double FinalPrice=price-discount;
	
	public static void main(String[] args) {
		Book b=new Book();
		System.out.println("The Book Name is: "+b.BookTitle);
		System.out.println("The Author Name is: "+b.authorname);
		System.out.println("The book price is: "+b.price);
		System.out.println("The discount is: "+b.discount);
		System.out.println("The Final price is: "+b.FinalPrice);
		
	}

}

