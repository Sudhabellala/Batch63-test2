package constructors;

public class Customer {
	
	int age;
	int cid;
	String cname;
	long phone;
	
	Customer() {
		this(18);//constructor calling in same class
		System.out.println("No arg constructor called");
	}
	
	Customer(int age){
		this(age,1);
		System.out.println("1-arg parameterized constructor !");
		this.age=age;
	}
	
	Customer(int age,int cid){
		this(age,cid,"Unknown",99999999L);
		//this(); Recursive constructor invocation Customer()
		System.out.println("2-arg parameterized constructor !");
		this.age=age;
		this.cid=cid;
	}
	
	Customer(int age,int cid,String cname,long phone){
		this.age=age;
		this.cid=cid;
		this.cname=cname;
		this.phone=phone;
		
	}

	public static void main(String[] args) {
		System.out.println("main method started");
		Customer c1=new Customer();
		c1.display();
		
		Customer c2=new Customer(22
				);
		c2.display();
		
		System.out.println("main method ended!");
	}
	
	void display() {
		
		System.out.println("*************************");
		System.out.println("Age: "+age);
		System.out.println("Customer ID:"+cid);
		System.out.println("Customer Name: "+cname);
		System.out.println("phone: "+phone);
	}
}
