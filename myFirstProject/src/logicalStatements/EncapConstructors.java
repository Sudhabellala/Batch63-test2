package logicalStatements;

public class EncapConstructors {
	private  int eid;
	private String firstName;
	private String lastName;
	private String userName;
	private int age;
	public EncapConstructors(int eid, String firstName, String lastName, String userName, int age) {
		super();
		this.eid = eid;
		this.firstName = firstName;
		this.lastName = lastName;
		this.userName = userName;
		this.age = age;
	}
	void getFields() {
		System.out.println(eid);
		System.out.println(firstName);
		System.out.println(lastName);
		System.out.println(userName);
		System.out.println(age);
	}
	
}
