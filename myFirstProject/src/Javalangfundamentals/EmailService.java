package Javalangfundamentals;

public class EmailService {
	
	void sendEmail(String to,String message) {
		System.out.println("Email sent to "+to+" with the message "+message);
		
	}

	public static void main(String[] args) {
		EmailService e=new EmailService();
		e.sendEmail("sudha@gmail", "Welcome to our app.");
	}

}
