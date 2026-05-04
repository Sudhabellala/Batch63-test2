package Javalangfundamentals;

public class Health {
	
	void calculateBmi(double weight,double height) {
		double bmi=weight/(height*height);
		System.out.println("BMI: "+bmi);
	}

	public static void main(String[] args) {
		Health h=new Health();
		h.calculateBmi(52, 5);
	}

}
