package Javalangfundamentals;

public class Book {
	int BookId;
	String Title;
	String Author;
	double Price;
	double DiscountPercentage;
	double DiscountAmount;
	double FinalPrice;
	
	public static void main(String[] args) {
		Book b=new Book();
		b.BookId=1;
		b.Title="Harry Potter";
		b.Author="Rowling";
		b.Price=500;
		b.DiscountPercentage=10;
		b.DiscountAmount=(10*b.Price)/100;
		b.FinalPrice=b.Price-b.DiscountAmount;
		
		System.out.println("Book ID: "+b.BookId);
		System.out.println("Title: "+b.Title);
		System.out.println("Author: "+b.Author);
		System.out.println("Price: "+b.Price);
		System.out.println("Discount Percentage: "+b.DiscountPercentage);
		System.out.println("Discount Amount: "+b.DiscountAmount);
		System.out.println("Final Price: "+b.FinalPrice);
	
	}

}
