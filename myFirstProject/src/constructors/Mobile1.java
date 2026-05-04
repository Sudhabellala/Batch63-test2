package constructors;

public class Mobile1 {
	
	String model;
	String brand;
	String color;
	
	
	public Mobile1(String model, String brand) {
		this.model = model;
		this.brand = brand;
	}
	
	//public Mobile1(String model, String color) {
		//this.model = model;
		//this.color = color;
	//}

	public static void main(String[] args) {
		Mobile1 m1=new Mobile1("9R","One Plus");
		m1.display();
		
		Mobile1 m2=new Mobile1("9R","Blue");
		m2.display();
		
	}
	void display() {
		System.out.println("Model: "+model);
		System.out.println("Brand: "+brand);
		System.out.println("Color: "+color);
	}

}
