package oops;
//OOPConceptsDemo.java
//Abstraction using Interface
interface Workable {
 void work();
}
//Encapsulation: data hiding with private variables
 class Employee {
 private String name;
 private int salary;
 // Constructor (initialization)
 public Employee(String name, int salary) {
     this.name = name;
     this.salary = salary;
 }
 // Getters and Setters (to access private data)
 public String getName() { return name; }
 public void setName(String name) { this.name = name; }

 public int getSalary() { return salary; }
 public void setSalary(int salary) { this.salary = salary; }
 // Method (common behavior)
 public void showDetails() {
     System.out.println("Employee Name: " + name + ", Salary: " + salary);
 }
}
//Inheritance: Developer inherits from Employee
 class Developer extends Employee implements Workable {
 private String project;
 // Constructor calling parent class constructor using super()
 public Developer(String name, int salary, String project) {
     super(name, salary);
     this.project = project;
 }
 // Method Overriding (Polymorphism - runtime)
 @Override
 public void showDetails() {
     System.out.println("Developer Name: " + getName()+", Salary: " + getSalary() +", Project: " + project);
 }
 // Implementing interface method (Abstraction)
 public void work() {
     System.out.println(getName() + " is working on " + project + " project.");
 }
}
//Main class to test all concepts
 public class OOPConceptsDemo {
 public static void main(String[] args) {
     // Object creation (Encapsulation)
     Employee e1 = new Employee("Ravi", 30000);
     e1.showDetails();

     // Inheritance + Polymorphism
     Employee e2 = new Developer("Sudha", 50000, "Smart Campus"); // upcasting
     e2.showDetails();  // Developer’s showDetails() runs (runtime polymorphism)

     // Downcasting to access subclass-specific method
     if (e2 instanceof Developer) {
         Developer d = (Developer) e2;
         d.work();
     }
 }
}
 
