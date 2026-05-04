package constructors;

public class Shape {
	String type;
	Shape(){
		System.out.println("Shape Created");
	}
	
	Shape(String type){
		this.type=type;
		System.out.println("Shape Type: "+type);	
	}
	
	public static void main(String[] args) {
	
	}
	
static class Rectangle extends Shape{
	double length;
	double breadth;
	
	Rectangle(){
		//super();
		System.out.println("Rectangle Created");
	}
	
	Rectangle(String type,double length,double breadth){
		super(type);
		this.type=type;
		this.length=length;
		this.breadth=breadth;
		System.out.println("Length: "+length+", Breadth: "+breadth);
		double area=length*breadth;
		System.out.println("Area: "+area);
		
	}
	public static void main(String[] args) {
		Rectangle r1=new Rectangle();
		Rectangle r2=new Rectangle("Rectangle",30,20);
		//System.out.println("Length: "+r2.length+", Breadth: "+r2.breadth);
		//double area=r2.length*r2.breadth;
		//System.out.println("Area: "+area);
		
	}

	}
}