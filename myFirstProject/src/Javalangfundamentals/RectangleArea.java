package Javalangfundamentals;

public class RectangleArea {
	
	int getAreaOfRectangle(int length,int breadth) {
		int area=length*breadth;
		return area;
	}

	public static void main(String[] args) {
		RectangleArea r=new RectangleArea();
		int a=r.getAreaOfRectangle(30,10);
		System.out.println("Area of the rectangle is "+a);	
	}

}
