package constructors;

public class OverLoadConstructor {
	String name;
	int age;
	
	OverLoadConstructor(){
		name="unkmown";
		age=18;
	}
	
	OverLoadConstructor(String n){
		name=n;
		age=18;
	}
	
	OverLoadConstructor(String n,int a){
		name=n;
		age=a;
	}

	public static void main(String[] args) {
		OverLoadConstructor o1=new OverLoadConstructor();
		OverLoadConstructor o2=new OverLoadConstructor("Sudha");
		OverLoadConstructor o3=new OverLoadConstructor("Kalyani",22);
		
		System.out.println("Name of the student is "+o1.name+" and age is "+o1.age);
		System.out.println("Name of the student is "+o2.name+" and age is "+o2.age);
		System.out.println("Name of the student is "+o3.name+" and age is "+o3.age);
	}

}
