package Javasession;

public class Stringmanipulation {

	public static void main(String[] args)
	{
		String s="Life is beautiful";
		//Length of the string
		System.out.println(s.length());
		
		//charAt
		System.out.println(s.charAt(6));
		//System.out.println(s.charAt(-1));//StringIndexOutOfBoundsException
		//System.out.println(s.charAt(18));//StringIndexOutOfBoundsException
		System.out.println(s.charAt(0));
		
		//indexOf--index of the char
		System.out.println(s.indexOf("i"));
		System.out.println(s.indexOf("i", s.indexOf("i")+1));
		System.out.println(s.indexOf("java"));
		if(s.indexOf("jav")>0)
		{
			System.out.println("Correct message");
		}
		//trim
		String st="   Hello Selenium  ";
		System.out.println(st.trim());
		//replace replace the gaps
		String s1="Hello Testing";
		System.out.println(s1.replace(" ", ""));
		System.out.println(st.replace(" ", ""));
		//Tolowercase and Uppercase
		System.out.println(st.toLowerCase().trim());
		System.out.println(st.toUpperCase().trim());
		//Equals
		String t1="Hello Madhu";
		String t2="Hello madhu";
		System.out.println(t1.equals(t2));//false
		System.out.println(t1.equalsIgnoreCase(t2));//true
		
		//contains
		System.out.println(t1.contains("Madhu"));
		
		//Substring
		System.out.println(t2.substring(3));
		String s2="Order id is 23456";
		System.out.println(s2.substring(s2.indexOf("s")+2,s2.length()));
		//split
		String tr="Java_Python_Ruby_C#";
		String k[]=tr.split("_");
		System.out.println(k.length);
		for(String g:k)
		{
			System.out.println(g);
		}
		System.out.println(k[2]);
		String l="xXJaveXxXpythonXxXRuby";
		String d[]=l.split("xX");
		System.out.println(d[0]);//op-blank
		for(String f:d)
		{
			System.out.println(f);
		}
	}

}
