package construcor;

public class Employee 
{
	String name;
	int age;
	String city;
	double salary;
	boolean isActive;
	
	public Employee(String name, double salary, boolean isActive) 
	{
		
		this.name = name;
		this.salary = salary;
		this.isActive = isActive;
	}

	public Employee(String name, int age, String city, double salary, boolean isActive) {
		
		this.name = name;
		this.age = age;
		this.city = city;
		this.salary = salary;
		this.isActive = isActive;
	}

	

	public Employee(String name, int age) {
	
		this.name = name;
		this.age = age;
	}

	public static void main(String[] args) 
	{
		Employee e1=new Employee("Sydney", 13.45, true);
		System.out.println(e1.name+ " "+ e1.salary +" "+e1.isActive+ ""+e1.age);
		Employee e2=new Employee("Madhu", 28);
		System.out.println(e2.city+""+e2.age+""+e2.name);
		
	}

}
