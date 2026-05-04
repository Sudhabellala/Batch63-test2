package Javalangfundamentals;

public class StudentData {
	int getStudentData() {
		return 120;
	}
	public static void main(String[] args) {
		StudentData s=new StudentData();
		int data=s.getStudentData();
		System.out.println("Total Students: "+data);	
	}

}
