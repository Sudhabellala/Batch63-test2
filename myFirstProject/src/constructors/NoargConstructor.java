package constructors;

public class NoargConstructor {
	String name;
	int age;
	
	NoargConstructor(){
		name="unknown";
		age=18;
	}

	public static void main(String[] args) {
		NoargConstructor n=new NoargConstructor();
		System.out.println("Name of the student is "+n.name+" and age is "+n.age);
	}

}
