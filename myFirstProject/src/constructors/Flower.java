package constructors;

public class Flower {
	String name="Lotus";
	public static void main(String[] args) {
		System.out.println("main method started from Flower");

	}
}

class Rose extends Flower{
	String name="Rose";
	
	public static void main(String[] args) {
		System.out.println("main method started from Rose");
		Rose r=new Rose();
		r.show();
		//cannot use in suoer and this in a static context
		//System.out.println("Flower Name: "+super.name);
	}
	
	public void show() {
		String name="Jasmin";
		System.out.println("show method called");
		System.out.println("Flower Name: "+name);
	}
}	


