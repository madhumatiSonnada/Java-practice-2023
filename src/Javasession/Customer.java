package Javasession;

public class Customer 
{
		//1)No return and No argument
	public void test()
	{
		int a=20;
		int b=40;
		System.out.println(a+b);
	}
	//2)No argument and some return
	public int add()
	{
		int i=30;
		int j=45;
		int total=i+j;
		return total;//here we are returning integer value so return type should int
	}
	//3)argument and return
	public String traninerName()
	{
		System.out.println("trainer naeme");
		String name="madhu";
		return name;
	}
	//4.some argument and some return
	public int sumTwo(int x,int y)
	{
		int sum=x+y;
		return sum;
	}
	//retrun marks of particular student
	//pass the name
	//return marks
	public int studentMarks(String name)
	{
		System.out.println("Student marks");
		if(name.equalsIgnoreCase("anu"))
		{
			return 90;
		}
		else if(name.equalsIgnoreCase("radha"))
		{
			return 70;
		}
		else if(name.equalsIgnoreCase("tom"))
		{
				return 85;
		}
		else
		{
			System.out.println("student marks not found");
			return -1;
		}
	}
	
	
	//2nd method
	public int getmarks(String nam)
	{
		int marks=-1;
		if(nam.equalsIgnoreCase("anu"))
		{
			marks=90;
		}
		else if(nam.equalsIgnoreCase("radha"))
		{
			marks=70;
		}
		else if(nam.equalsIgnoreCase("tom"))
		{
				marks=85;
		}
		else
		{
			System.out.println("student marks not found");
			
		}
		return marks;
		
	}
	
	
	
	
	public static void main(String[] args) 
	{
		//to call test method we have to create an object
		Customer c=new Customer();
		c.test();
		int k=c.add();//we need to create a int variable to hold returned value (total amount)
		System.out.println(k);
		String n=c.traninerName();
		System.out.println(n);
		int s=c.sumTwo(10,70);
		System.out.println("sum of 2 numbers are "+s);
		int marks=c.studentMarks("RADHA");
		System.out.println(marks);
		int marks1=c.studentMarks("madhu");
		System.out.println(marks1);
		if(marks1==-1)
		{
			System.out.println("Please enter the correct name");
		}
		int m=c.getmarks("tom");
		System.out.println(m);
		
		
	}

}
