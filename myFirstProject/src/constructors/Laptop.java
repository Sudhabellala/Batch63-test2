package constructors;

public class Laptop {
	String name;
	int ram;
	double price;
	String color;

	
	Laptop(String name, int ram){
		this.name=name;
		this.ram=ram;
	}
	
	public Laptop(String name, int ram, double price, String color) {
		this.name = name;
		this.ram = ram;
		this.price = price;
		this.color = color;
	}



	Laptop(){
		System.out.println("No arg constructor created");
	}
	
	public static void main(String[] args) {
		System.out.println("main method started ");
		Laptop l1=new Laptop("Dell", 16);
		l1.show();
		
		Laptop l2=new Laptop("Lenovo",8,70000.00,"Grey");
		l2.show();
		
		Laptop l4=new Laptop("HP",32,60000.00,"Blue");
		l4.show();
		
		Laptop l3=new Laptop();
		l3.show();
		
		System.out.println("Main method ended ");
	}
	
	void show() {
		System.out.println("**************************");
		System.out.println("name of the laptop "+name);
		System.out.println("RAM :"+ram);
		System.out.println("Color: "+color);
		System.out.println("Price: "+price);
		
		
	}
}
