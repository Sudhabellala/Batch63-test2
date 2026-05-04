package Javalangfundamentals;
//convert the exchangeRateFloat(Float) to double and calculate the Converted amount
public class DataTypes2 {
	double amount=1000;
	float exchangeRateFloat=0.0123F;
	double x=exchangeRateFloat;
	double convertAmount=amount*x;
	
	public static void main(String[] args) {
		DataTypes2 d=new DataTypes2();
		System.out.println("Converted Amount: "+d.convertAmount);
		
	}

}
