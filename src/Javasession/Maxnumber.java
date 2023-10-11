package Javasession;

public class Maxnumber {

	public static void main(String[] args)
	{
		int x=300;
		int y=700;
		int z=600;
		
		if(x>y && x>z)
		{
			System.out.println("x is greater");
		}
		else if(y>z)
		{
			System.out.println("y is greater");
		}
		else
		{
			System.out.println("z is greater");
		}
		
		//if and else ex--in this code it will go to each line eventhogh the condition is 
		//satisfied in the first line itself and executes else part too--if if case
		/*String browser="chrome";
		if (browser.equals("chrome"))// for non primitive data types we have to use .equals operator to compare and for primitive is is == operator
		{
			System.out.println("launch chrome browser");
		}
		if(browser.equals("firefox"))
		{
			System.out.println("launch firefox browser");
		}
		if(browser.equals("edge"))
		{
			System.out.println("launch edge browser");
		}
		else
		{
			System.out.println("Please enter the valid browser");
		}*/
		
		//if else-if--there is a drawback here, it will navigate to each line untill it finds the condition so 
		//unnecesarry it will go to all the lines 
		String browser="chrome";
		
		if(browser.equals("firefox"))
		{
			System.out.println("launch firefox browser");
		}
		if(browser.equals("edge"))
		{
			System.out.println("launch edge browser");
		}
		if (browser.equals("chrome"))
		{
			System.out.println("launch chrome browser");
		}
		else
		{
			System.out.println("Please enter the valid browser");
		}
		
	}

}
