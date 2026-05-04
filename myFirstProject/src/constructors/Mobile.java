package constructors;

public class Mobile {
	String name;
	int storage;
	float ram;
	double price;
	
	Mobile(String name,int storage,float ram,double price){
		this.name=name;
		this.storage=storage;
		this.ram=ram;
		this.price=price;
		
	}

	public static void main(String[] args) {
		Mobile m=new Mobile("Poco M2", 64, 16.5f, 12);
		m.show();
	}
	
	void show() {
		System.out.println(name);
		System.out.println(storage);
		System.out.println(ram);
		System.out.println(price);
		
	}

}
