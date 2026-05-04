package constructors;

public class Employeeee {
	int id;
	String name;
	double salary;
	//int id1=1;
	//String name1="Sudha";
	//double salary1=20000.00;
	
	//no arg constructor
	Employeeee(){
		this.id=1;
		this.name="sudha";
		this.salary=20000.00;
		
	}
	
	//parameterized constructor
	Employeeee(int id,String name,double salary){
		this.id=id;
		this.name=name;
		this.salary=salary;
		
	}
	
	//copy constructor
	Employeeee(Employeeee e2){
		this.id=e2.id;
		this.name=e2.name;
		this.salary=e2.salary;
		//this.movie=m2.movie;
	}
	

	public static void main(String[] args) {
		Employeeee e=new Employeeee();
		Employeeee e1=new Employeeee(2,"Kalyani",40000.00);
		Employeeee e2=new Employeeee(e1);
		e.display();
		e1.display();
		e2.display();
		
	}
	
	void display() {
		System.out.println("*******************");
		System.out.println("Employee ID: "+id);
		System.out.println("Employee Name: "+name);
		System.out.println("Employee Salary: "+salary);
		
	}

}
