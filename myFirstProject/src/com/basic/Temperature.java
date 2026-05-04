package com.basic;

public class Temperature {
	static int F=40;
	static int C=35;
	static void cel() {
		int C;
		C=(F-32)*5/9;
		System.out.println("The Temperature after converting from F to C: "+C);

	}
	void far() {
		int F;
		F=(C*9/5)+32;
		System.out.println("The Temperature after converting from C to F: "+F);
	}
	public static void main(String[] args) {
		Temperature t=new Temperature();
		
		cel();
		t.far();
	}

}

