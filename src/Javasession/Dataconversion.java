package Javasession;

public class Dataconversion 
{

	public static void main(String[] args) 
	{
		//String to integer conversion
		String s="100";
		int i=Integer.parseInt(s);
		System.out.println(i+10);
		
		//String to double conversion
		String x="20.33";
		double d=Double.parseDouble(x);
		System.out.println(d);
		//String to interger
		String a="AA230A";
		String k=a.substring(2, a.length()-1);
		int e=Integer.parseInt(k);
		System.out.println(e+70);
		
		//Integer to string
		int l=400;
		String j=String.valueOf(l);
		System.out.println(j);
		boolean h=true;
		String u=String.valueOf(h);
		System.out.println(h);
		
		//word in single quote
		String t="Welcome to \"java\" world";
		System.out.println(t);
		
	}

}
