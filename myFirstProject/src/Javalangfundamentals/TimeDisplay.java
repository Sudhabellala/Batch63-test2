package Javalangfundamentals;

import java.time.LocalDateTime;

public class TimeDisplay {
	void showTime() {
		System.out.println("Current Time: "+LocalDateTime.now());		
	}

	public static void main(String[] args) {
		TimeDisplay t=new TimeDisplay();
		t.showTime();
		
	}

}
