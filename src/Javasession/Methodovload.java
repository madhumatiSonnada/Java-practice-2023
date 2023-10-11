package Javasession;

public class Methodovload 
{

	public void test()
	{
		System.out.println("Test");
	}
	public void test(int a,int b)
	{
		System.out.println(a+b);
	}
	public void test(int b,String a)
	{
		System.out.println("testing");
	}
	public void login()
	{
		System.out.println("Login");
	}
	public void login(String user,String pswd)
	{
		System.out.println("Login using user and pswd");
	}
	public void login(String user,int OTP)
	{
		System.out.println("Login using user and OPT");
	}
	public void login(long phno,int OTP)
	{
		System.out.println("login using phno and OTP");
	}
	public static void main(String[] args) 
	{
		Methodovload m=new Methodovload();
		m.test(10, 20);
		m.test(10, "madhu");
		m.login("madhumati", 1234);
	}

}
