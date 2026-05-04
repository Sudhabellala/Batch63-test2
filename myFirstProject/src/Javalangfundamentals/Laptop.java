package Javalangfundamentals;

public class Laptop {
	String name;
	int ram;
	
	Laptop(String name, int ram){
		this.name=name;
		this.ram=ram;
	}
	
	Laptop(){
		
	}
	
	public static void main(String[] args) {
		System.out.println("main method started ");
		Laptop l1=new Laptop("Delhi", 16);
		l1.show();	
		
		Laptop l2=new Laptop();
		l2.show();	
	}
	
	void show() {
		System.out.println(name);
		System.out.println(ram);
	}
}
