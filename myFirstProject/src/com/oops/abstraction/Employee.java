package com.oops.abstraction;

public class Employee {
	String name;
	int salary;
	
	Employee(String name,int salary){
		this.name=name;
		this.salary=salary;
	}
	
	void calculateBonus() {
		double bonus=salary*0.2;
		System.out.println("bonus is: "+bonus);
	}
}

class Manager extends Employee{
	Manager(String name, int salary) {
		super(name, salary);
	}

	@Override
	public void calculateBonus() {
		double bonus=salary*0.5;
		System.out.println("bonus is: "+bonus);
	}
	
}
class Developer extends Employee{
	Developer(String name, int salary) {
		super(name, salary);
	}

	@Override
	public void calculateBonus() {
		double bonus=salary*0.4;
		System.out.println("bonus is: "+bonus);
	}
}
class Intern extends Employee{
	
	Intern(String name, int salary) {
		super(name, salary);
	}

	@Override
	public void calculateBonus() {
		double bonus=salary*0.3;
		System.out.println("bonus is: "+bonus);
	}
}

class main{
	public static void main(String[] args) {
		Employee e=new Employee("Sudha",25000);
		Manager m=new Manager("Jyothi",25000);
		Developer d=new Developer("Mouli",25000);
		System.out.println("name: "+e.name);
		e.calculateBonus();
		System.out.println("name: "+m.name);
		m.calculateBonus();
		System.out.println("name: "+d.name);
		d.calculateBonus();
		
	}
	}

