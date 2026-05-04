package com.collectionsframework2;

public class Student {
	int sid;
	String sname;
	double marksp;
	int age;

	@Override
	public String toString() {
		return "Student [sid=" + sid + ", sname=" + sname + ", marksp=" + marksp + ", age=" + age + "]";
	}

	public Student(int sid, String sname, double marksp, int age) {
		super();
		this.sid = sid;
		this.sname = sname;
		this.marksp = marksp;
		this.age = age;
	}

	public int getSid() {
		return sid;
	}

	public void setSid(int sid) {
		this.sid = sid;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public double getMarksp() {
		return marksp;
	}

	public void setMarksp(double marksp) {
		this.marksp = marksp;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
}
