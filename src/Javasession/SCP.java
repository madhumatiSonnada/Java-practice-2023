package Javasession;

public class SCP 
{

	public static void main(String[] args) 
	{
		String s1="Hello";
		String s2="Hello";
		System.out.println(s1==s2);
		String s3=new String("Hello");//new object is created in heap memory
		System.out.println(s1==s3);
		String str="Hello world";
		str=str +"java";
		System.out.println(str);
	}

}
