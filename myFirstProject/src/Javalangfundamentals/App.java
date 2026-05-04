package Javalangfundamentals;

public class App {
	String getVersion() {
		return "v2.5.1";
	}

	public static void main(String[] args) {
		App a=new App();
		String version=a.getVersion();
		System.out.println("The version of the app is: "+version);
		}
		
	}

