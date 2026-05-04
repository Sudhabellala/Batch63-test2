package Javalangfundamentals;

public class Service {
	
	Boolean isAvailable() {
		return true;
	}

	public static void main(String[] args) {
		Service s=new Service();
		if (s.isAvailable()) {
			System.out.println("The Service Available");
		}
		
	}

}
