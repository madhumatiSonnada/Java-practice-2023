package OopsEncapsulation;

public class Testemp 
{

	public static void main(String[] args) 
	{
		Employee e1=new Employee();
		e1.name="Tom";
		e1.age=20;
		e1.setSalary(20.33);
		System.out.println(e1.getSalary());

	}

}
