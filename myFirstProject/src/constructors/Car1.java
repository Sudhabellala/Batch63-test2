package constructors;

public class Car1 {
	String model;
	double pricePerDay;
	int days;
	
	static double total_rental_cost;
	
	Car1(String model,double pricePerDay){
		this.model=model;
		this.pricePerDay=pricePerDay;
		this.days=1;
		
	}
	
	Car1(String model,double pricePerDay,int days){
		this.model=model;
		this.pricePerDay=pricePerDay;
		this.days=days;
		
	}
	
	
	public static void main(String[] args) {
		
		Car1 c1=new Car1("BMW",15000.00);
		c1.display();
		
		Car1 c2=new Car1("SportsCar",17000.00,5);
		c2.display();
		
	}
	
	void display() {
		total_rental_cost=pricePerDay*days;
		System.out.println("Total Rental Cost is: "+total_rental_cost);
	}
}
