package constructors;

public class Student {
	int sid;
	String sname;
	int orgID;
	String orgName;
	
	@Override
	protected void finalize() throws Throwable {
		System.out.println("Finalize method called");
	}
	
	
	public Student(int sid, String sname,int orgID,String orgName) {
		this.sid = sid;
		this.sname = sname;
		this.orgID=orgID;
		this.orgName=orgName;
	}
	
	Student(){
		
	}

	public static void main(String[] args) {
		Student s1=new Student(1,"Sudha",1234,"Vcube");
		System.out.println(s1);
		s1=new Student(2,"Kalyani",3456,"VCube SS"); //Deep Copy
		System.out.println(s1);
		s1.show();
		
		System.gc();
		
		Student s2=new Student();
		System.out.println(s2);
		s2.show();
		Student s3=new Student();
		s3=s2;
		System.out.println(s3);
	}

	
	void show() {
		System.out.println("Student ID: "+sid);
		System.out.println("Student Name: "+sname);
		System.out.println("Student org ID: "+orgID);
		System.out.println("Student org Name: "+orgName);
	}
}
