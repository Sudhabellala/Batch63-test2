package constructors;

public class Person {
	String id;
	String name;
	
	Person(){
		this("3c","Sudha");
		System.out.println("no arg constructor called from person");
	}
	
	Person(String id,String name){
		System.out.println("two arg constructor called from person");
		this.id=id;
		this.name=name;
	}

	public static void main(String[] args) {
		System.out.println("main method started from person");
	}

}

class Employees extends Person{
	
	Employees(){
		
		System.out.println("no arg constructor called from Employees");
	}
	Employees(String id,String name){
		this();
		System.out.println("2 arg parameterized constructor called");
		this.id=id;
		this.name=name;
	}
	
	public static void main(String[] args) {
		System.out.println("main method started from Employee");
		
		Employees e=new Employees();
		System.out.println(e.id);
		System.out.println(e.name);
		
		//Employees e1=new Employees();
		//System.out.println(e1.id);
		//System.out.println(e1.name);
		
		
	}
}
