package Javalangfundamentals;

public class OtpGeneration {
	
	int generateOtp() {
		return (int)(Math.random()*9000)+1000;	
	}
	public static void main(String[] args) {
		OtpGeneration o=new OtpGeneration();
		int otp=o.generateOtp();
		System.out.println("OTP is: "+otp);
		
	}

}
