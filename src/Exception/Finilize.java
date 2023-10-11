package Exception;

public class Finilize
{
	String name;
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Finilize f=new Finilize();
		f=null;
		System.gc();
	}	
		public void finalize()
		{
			System.out.println("Finilize");
		}
		

	}


