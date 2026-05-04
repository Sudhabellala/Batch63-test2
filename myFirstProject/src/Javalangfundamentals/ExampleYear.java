package Javalangfundamentals;

import java.time.Year;

public class ExampleYear {
	
	int getYear() {
		return Year.now().getValue();
	}

	public static void main(String[] args) {
		
		ExampleYear e=new ExampleYear();
		int year=e.getYear();
		System.out.println("Current Year: "+year);
	}

}
