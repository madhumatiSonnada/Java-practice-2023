package Exception;

public class Trycatch 
{
int age;
	public static void main(String[] args) 
	{
		int a[]=new int[2];
		Trycatch tc=new Trycatch();
		tc=null;
		try 
		{
			System.out.println("Hi");
			//int i=9/0;
			//a[4]=5;
			tc.age=20;
		}
		catch(ArithmeticException e)
		{
			System.out.println("Airthmetic exception");
			e.printStackTrace();
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("array index out of bound");
			e.printStackTrace();
		}
		catch(NullPointerException e)
		{
			System.out.println("Null pointer exception");
			e.printStackTrace();
		}
		catch(Exception e)//handles all kind of exception
		{
			System.out.println("exception");
			e.printStackTrace();
		}
		catch(Throwable e)
		{
			System.out.println("throwable");
			e.printStackTrace();
		}
		System.out.println("Bye");
	}

}
