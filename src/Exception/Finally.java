package Exception;

public class Finally 
{
	public int getmarks()
	{
	try
	{
		int i=10/0;
		//int i=10/2;
		return 80;
	}
	catch(Exception e)
	{
		System.out.println("Exception");
		e.printStackTrace();
		return 70;
	}
	finally
	{
		return 90;
	}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Finally f=new Finally();
		int marks=f.getmarks();
		System.out.println(marks);
		

	}

}
