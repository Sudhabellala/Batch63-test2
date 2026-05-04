package constructors;

class Scooty extends Vehicle{
	
	Scooty(){
		super(1.500000,"Ather");
		System.out.println("No arg constructor called");
	}
	
	public static void main(String[] args) {
		System.out.println("main method from scooty");
		Scooty s1=new Scooty();
		System.out.println(s1.price);
		System.out.println(s1.name);
	}

}

public class Vehicle {
	
	double price;
	String name;
	
	Vehicle(double price,String name){
		System.out.println("Two arg constructor from vehicle");
		this.price=price;
		this.name=name;
		
	}

	Vehicle(){
		System.out.println("No arg constructor from vehicle");
	}

	public static void main(String[] args) {
		System.out.println("main method from vehicle");
		
	}

}
