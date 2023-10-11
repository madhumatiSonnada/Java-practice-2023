package Exception;

public class Throw {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String data=null;
		if(data==null)
		{
		try
		{
			throw new Exception("Not valid data");
		}
		catch(Exception e)
		{
			System.out.println("Null pointerexception");
			e.printStackTrace();
		}
		}
		

	}

}
