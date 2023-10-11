package Superkeyword;

public class Employee extends Company
{
	int salary=300;
	
	public Employee()
	{
		super(10);
		System.out.println("Employee constructor");
	}
	public void cafe()
	{
		System.out.println("Employee");
		System.out.println(salary);
		System.out.println(super.salary);
		super.cafe();
	}
	
}
