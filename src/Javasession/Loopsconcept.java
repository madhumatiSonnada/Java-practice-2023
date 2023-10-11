package Javasession;

public class Loopsconcept 
{

	public static void main(String[] args) 
	{
		//While loop
		//1.use when number of iterations are not fixed
		//Ex: Welcome notification display in hotel
		//When finding the element in the page
		//When loading the page
		//pagination
		
		int i=1;
		while(i<=10)
		{
			System.out.println(i);//prints 1 to 10
		i++;
	
	}
		
		System.out.println("---------------------------");
		//infinite loop
		//int l=1;
	//	while(l<=10)
		//{
		//	System.out.println(l);//here i value is 1 and everytime condition will be satisfied
			//that is i<=10 so it will keep on print 1 infinity times
			
		int k=10;
		while(k>=0)
		{
			System.out.println(k);//whithout break it will print from 10 to 0
			//with break it prints only 10 and come out of the loop 
			//we can use break in while loop
			k--;
			break;
		}
		
		//for loop--use only when number of iterations are fixed
		//no of days in calandar
		//menu list on the page
		//dropdown traversing 
		System.out.println("for loop");
		for(int a=0;a<=10;a++)
		{
			System.out.println(a);
		}
		
		for (int b=10;b>=1;b--)
		{
			System.out.println(b);
		}
		
		//do while loop--executes atleast once
		int c=1;
		do
		{
			c++;
			System.out.println(c);//op--prints 2 to 11
			
		}
		while(c<=10);
}
}
