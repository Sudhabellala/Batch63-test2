package constructors;

public class Students {
	static int rollNo=100;
	String name;
	String course;
	int rno;
	
	
	Students(){
		//rollNo=101;
		//rollNo++;
		System.out.println("No arg constructor called");
	}
	
	Students(String name,String course){
		this.rno=rollNo++;
		this.name=name;
		this.course=course;
		//rollNo++;
		
		//rollNo=101;
		//rollNo++;
	}
	public static void main(String[] args) {
		Students s1=new Students();	
		Students s2=new Students("Sudha","MCA");
		s2.display();
		Students s3=new Students("Kalyani","ECE");
		s3.display();
		Students s4=new Students("Jyothi","ECE");
		s4.display();
	}
	
	void display() {
		System.out.println("***********************************");
		System.out.println("Student Roll.no is: "+rollNo+" \nStudent Name is: "+name+" \nStudent Course is: "+course);
		
	}
}
