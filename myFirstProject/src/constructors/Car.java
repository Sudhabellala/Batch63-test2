package constructors;

public class Car {
	String model;
	String brand;
	String color;
	
	//no-arg constructor
	Car(){
		System.out.println("no arg constructor called");
		model = "unknown";
		brand = "unknown";
		color = "unknown";
	}
	
	//parameterized constructor
	Car(String model,String brand,String color){
		this.model=model;
		this.brand=brand;
		this.color=color;
	}

	public static void main(String[] args) {
		System.out.println("main method started");
		//This below constructor created with the help of Default constructor
		Car c=new Car();
		c.show();
		Car c1=new Car("Sonet","KIA","RED");
		c1.show();
		
		Car c2=new Car();
		c2.model="Seltos";
		c2.brand="KIA";
		c2.color="White";
		c2.show();
		
	}

	void show(){
		System.out.println("********************");
		System.out.println("Model of the car: "+model);
		System.out.println("Brand of the car: "+brand);
		System.out.println("Color of the car:"+color);
	}
}

