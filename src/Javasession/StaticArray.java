package Javasession;

public class StaticArray 
{

	public static void main(String[] args) 
	{
		//Static Array--Collection of similar type of data.
		//We use static array when there is fixed size.
		//Limitation--Only similar type of data we can store
		//Array index alway starts with 0 to higher index will be length-1
		//Syntax
		int i[]=new int[5];
		i[0]=10;
		i[1]=20;
		i[2]=30;
		i[3]=40;
		i[4]=50;
		System.out.println(i[4]);//o/p=50
		//System.out.println(i[5]);//o/p=Arrayindexoutofbound exception--here we are allocated memory 
		//for only 5 and we are trying to store 6th value so getting arrayindexoutof bound exception
		//fetch all the values using for loop
		System.out.println("For loop");
		for(int j=0;j<i.length;j++)
		{
			System.out.println(i[j]);
		}
		System.out.println("for each loop");
		for(int e:i)
		{
			System.out.println(e);
		}
		//print alphabate a to z
		for (char c='A';c<='Z';c++)
		{
			System.out.println(c);
		}
		//Double type
		double d[]=new double[4];
		d[0]=10.54;
		d[1]=12;
		d[2]=15.65;
		d[3]=20.78;
		System.out.println(d[1]);
		
		for(double h:d)
		{
			System.out.println(h);
			if(h==12)
			{
				System.out.println("Hii");
				//break;
			}
			else
			{
				System.out.println("Bye");
			}
		}
		
		String s[]=new String[4];
		s[0]="Madhu";
		s[1]="Hanu";
		s[3]="Sonnada";
		//s[2] is not assigned with any value so by default it will dispaly as null -string default value
		//for int is will be 0
		
		System.out.println("print in reverse order");
		for(int k=s.length-1;k>=0;k--)
		{
			System.out.println(s[k]);
		}
		//Object type- We can store any kind of data in object type
		//limitation: size is fixed in object date type
		Object o[]=new Object[3];
		o[0]="Madhu";
		o[1]=20;
		o[2]='a';
		for(Object g:o)
		{
			System.out.println(g);
		}
		
		
// to overcome the problem with Static array and object date type we will go for Dynamic array
	}

	
}
