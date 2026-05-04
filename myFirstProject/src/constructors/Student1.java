package constructors;

public class Student1 {
	String name;
	int age;
	
	Student1(){
		System.out.println("No arg Constructor called");
		name="Default";
		age=001;
		display();
	}
	
	Student1(String name,int age){
		this.name=name;
		this.age=age;
		display();
	}

	public static void main(String[] args) {
		Student1 s1=new Student1();
		Student1 s2=new Student1();
		Student1 s3=new Student1();
		Student1 s4=new Student1();
		Student1 s5=new Student1();
		
		Student1 s6=new Student1("kalyani",22);
		Student1 s7=new Student1("Vedha",20);
		Student1 s8=new Student1("Gowtham",21);
		Student1 s9=new Student1("Jyothi",22);
		Student1 s10=new Student1("Surya",24);
		
	}
	
	void display() {
		System.out.println("*******************************");
		System.out.println("Name of the student is: "+name);
		System.out.println("Age of the student is: "+age);
	}

}
