package constructors;

//Parent Class
class Employee1 {
	Employee1() {
		System.out.println("Employee (Parent) constructor executed");
	}
}
//child class
class Manager1 extends Employee1 {
	int bonus;

	//Default constructor (calls parameterized constructor)
	Manager1() {
		this(5000);   // constructor chaining
		System.out.println("Manager Default Constructor executed");
	}

	//Parameterized constructor
	Manager1(int bonus) {
		super();   // calls parent class constructor
		this.bonus = bonus;
		System.out.println("Manager Parameterized Constructor executed with bonus: " + bonus);
	}

	//Main Class
	public static void main(String[] args) {
		// Creating Manager object using default constructor
		Manager1 m = new Manager1();
	}
}
