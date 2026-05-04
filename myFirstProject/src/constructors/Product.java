package constructors;

public class Product {
	int id;
	String name;
	double price;
	int quantity;
	
	Product(){
		
	}
	
	Product(int id,String name,double price,int quantity){
		this.id=id;
		this.name=name;
		this.price=price;
		this.quantity=quantity;
	}
	
	double calculateTotal() {
		return price*quantity;
	}
	
	void applyCoupon(double discount) {
		price=price-(price*10)/100;
	}
	
	void displayProduct() {
		System.out.println("Product ID: "+id);
		System.out.println("Product Name: "+name);
		System.out.println("Product Price: "+price);
		System.out.println("Product Quantity: "+quantity);
		System.out.println("Total Cost: "+calculateTotal());
		System.out.println("*********************************");	
	}
	
	public static void main(String[] args) {
		Product p1=new Product(1,"Laptop",70000.00,2);
		System.out.println("Before Discount:");
		p1.displayProduct();
		
		p1.applyCoupon(10);
		System.out.println("After Discount:");
		p1.displayProduct();	
	}
}
