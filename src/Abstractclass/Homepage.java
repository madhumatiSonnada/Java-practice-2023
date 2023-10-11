package Abstractclass;

public class Homepage extends Page
{
	
	public Homepage()
	{
		System.out.println("Homepage constructor");
	}
	
	public Homepage(int a)
	{
		System.out.println("homepage constructor" +a);
	}
	@Override
	public void title() {
		System.out.println("homepage title");
		
	}

	@Override
	public void url() {
		System.out.println("homepage url");
		
	}
	public void timeout()
	{
		System.out.println("homepage timeout");
	}
	public void login()
	{
		System.out.println("login");
	}

}
