package Javasession;

import java.lang.invoke.MethodHandles.Lookup.ClassOption;
import java.util.ArrayList;

public class carbooking
{
	/**WAP to return list of cars for a given car type
		 * 
		 */
		public ArrayList<String> booking(String car)
		{
			System.out.println("car type"+car);
			ArrayList<String> ar=new ArrayList<String>();
			if(car.equals("sedan"))
			{
				ar.add("a");
				ar.add("b");
				ar.add("c");
				
			}
			else if(car.equals("SUV"))
			{
				ar.add("d");
				ar.add("e");
			}
			else
			{
				System.out.println("car typ  "+car+ "not avalilable");
			}
			return ar;
		}
	
public static void main(String[] args) 
{
	carbooking cb=new carbooking();
	ArrayList<String> a=cb.booking("sedan");
	System.out.println(a);
}
}
