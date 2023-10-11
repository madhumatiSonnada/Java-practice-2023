package Javasession;

public class Stringconcation {

	public static void main(String[] args) 
	{
		String s="xyz";
		String s1="abc";
		
		int i=100;
		int i1=200;
		
		System.out.println(s+i+i1);
		System.out.println(i+i1+s+s1);
		System.out.println(s+(i+i1));
		
		//Char
		char c='a';
		char c1='b';
		char c2='1';
		System.out.println(c+c1+c2);
		System.out.println((int)c1);
		System.out.println(c+c1+c2+s+s1);
		
		System.out.println(i+i1);
		System.out.println(i/i1);
		System.out.println(5/2);
		System.out.println(5.0/2);
		//System.out.println(9/0);//AirthmeticException
		System.out.println(0/9);
		//System.out.println(0/0);//AirthmeticException
		System.out.println(0.0/0.0);//not a number-NaN
		System.out.println(0.0/0);//not a number-NaN
		System.out.println(0/0.0);//not a number-NaN
		System.out.println(2.5/0);//Infinity
		System.out.println(2.5/0.0);//Infinity
	}

}
