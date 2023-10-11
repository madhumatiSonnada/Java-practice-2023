package construcor;

import java.util.ArrayList;
import java.util.Arrays;

public class Testuser 
{

	public static void main(String[] args) 
	{
		ArrayList<String> ar=new ArrayList<String>();
		ar.add("samsang");
		ar.add("phone");
		ar.add("oppo");
		
		User u=new User("madhu",25,ar);
		System.out.println(u.name);
		System.out.println(u.age);
		System.out.println(ar);
		String[] ord= {"samsung 10","mac pro","iphone20"};
		User u1=new User("madhu",25,ar,ord);
		System.out.println(u1.name);
		System.out.println(u1.age);
		System.out.println(ar);
		System.out.println(Arrays.toString(ord));
		
	}

}
