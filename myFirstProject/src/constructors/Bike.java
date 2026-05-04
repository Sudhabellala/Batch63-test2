package constructors;

public class Bike {
	String name;
	double price;
	
	
	Bike(){
		this.name="unknown";
		this.price=100;
	}
	
	Bike(String name1,double price1){
		name=name1;
		
		price=price1;
		
	}
	
	public static void main(String[] args) {
		System.out.println("main method started ");
		
		Bike b=new Bike();
		b.display();
		
		Bike b1=new Bike();
		b1.name="Classic";
		b1.price=250000.00;
		b1.display();
		
		Bike b2=new Bike("Yamaha-Fz-s",200000.00);
		b2.display();
		
		Bike b3=new Bike("RE-GT",350000.00);
		b3.display();
		
	}
	void display() {
		System.out.println("**********************");
		System.out.println(name);
		System.out.println(price);
	}
}

