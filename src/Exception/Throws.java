package Exception;

public class Throws 
{
	public void m1() throws ArithmeticException
	{
		m2();
	}
	public void m2() throws ArithmeticException
	{
		m3();
	}
	public void m3() 
	{
		try
		{
		m4();
		}
	catch(ArithmeticException e)
		{
			System.out.println("airthmetic exception");
			e.printStackTrace();
		}
	}
	public void m4() throws ArithmeticException
	{
		int i=9/0;
	}
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		
		Throws t=new Throws();
		t.m1();
		System.out.println("bye");
	}

}
