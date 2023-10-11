package Javasession;

public class Conditionaloperator {

	public static void main(String[] args)
	{
		int a=10;//here = is assignment operator
		int b=20;
		
		if (a>b)
		{
			System.out.println("a is greater than b");
		}
		else
		{
			System.out.println("b is greater than a");
		}
		
		if(a==b)//== is comparasion operator
		{
			System.out.println("Equal");
		}
		else
		{
			System.out.println("Not equal");
		}
		if(false)//dead code--it if true than always it executes true stmt only
		{
			System.out.println("test");
		}
		else
		{
			System.out.println("dev");
		}
		//We can write the code in other way
		boolean flag=true;
		if(flag)// here we are not getting any warning because this condition is depends upon flag value
		{
			System.out.println("Testing");
		}
		else
		{
			System.out.println("Development");
		}
		//nested if else
		int marks=92;
		if(marks>=90)//if marks greater than 90 then execute the if stmt else go to else
		{
			if(marks>=95)//here we have if condition inside if condition
			{
			System.out.println("Grade A++");
			}
			else
			{
				System.out.println("Grade A");
			}
		}
		else
		{
			System.out.println("Grade B");
		}
	}

}
