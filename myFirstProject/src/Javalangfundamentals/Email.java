package Javalangfundamentals;

public class Email {
	void getEmail(String to,String message) {
		System.out.println("Email sent to "+to+" and the message in it is "+message);	
	}

	public static void main(String[] args) {
		Email e=new Email();
		e.getEmail("Sudha", "Congratulations!");
	}

}
