package Javalangfundamentals;

public class UnitConversion {
	
	int toSeconds(int Minutes) {
		int sec=Minutes*60;
		return sec;	
	}
	
	int toMinutes(int hours) {
		int min=hours*60;
		return min;	
	}
	
	int hoursToSeconds(int Hours) {
		int h_s=Hours*60*60;
		return h_s;	
	}
	
	int daysToHours(int days) {
		int d_h=days*24;
		return d_h;
	}
	

	public static void main(String[] args) {
		UnitConversion u=new UnitConversion();
		
		int seconds=u.toSeconds(20);
		System.out.println("After Converting Minutes to Seconds "+seconds);
		
		int minute=u.toMinutes(30);
		System.out.println("After Converting Hours to Minutes "+minute);
		
		int h=u.hoursToSeconds(10);
		System.out.println("After Converting Hours to seconds "+h);
		
		int day=u.daysToHours(20);
		System.out.println("After Converting Days to Hours "+day);
				
	}

}
