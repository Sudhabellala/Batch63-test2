package Javalangfundamentals;

public class TestDemo2 {
	Integer Empno=101;
	String Ename="Sudha";
	Long Salary=5000l;
	Integer Hiredate=2023;
	String Experience="2 Years";
	Long Bonus=(10*Salary)/100l;
	Long AnnualBonus=Bonus*12;
	Long AnnualSalary=Salary*12;
	Long TotalAnnualEarnings=AnnualBonus+AnnualSalary;
	
	{
		System.out.println("Employee Number: "+Empno);
		System.out.println("Employee Name: "+Ename);
		System.out.println("Employee Salary: "+Salary);
		System.out.println("Employee HireDate: "+Hiredate);
		System.out.println("Employee Experience: "+Experience);
		System.out.println("Employee Bonus: "+Bonus);
		System.out.println("Employee AnnualBonus: "+AnnualBonus);
		System.out.println("Employee AnnualSalary: "+AnnualSalary);
		System.out.println("Employee TotalAnnualEarnings: "+TotalAnnualEarnings);
		
	}

	public static void main(String[] args) {
		TestDemo2 t=new TestDemo2();
		
	}
}
