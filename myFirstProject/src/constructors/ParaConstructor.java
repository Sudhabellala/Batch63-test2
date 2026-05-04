package constructors;

public class ParaConstructor {
	String name;
	int age;
	
	ParaConstructor(String n,int a){
		name=n;
		age=a;
	}

	public static void main(String[] args) {
		ParaConstructor p1=new ParaConstructor("Sudha",24);
		ParaConstructor p2=new ParaConstructor("Kalyani",22);
		
		System.out.println("Name of the student is "+p1.name+" and age is "+p1.age);
		System.out.println("Name of the student is "+p2.name+" and age is "+p2.age);
	}

}
