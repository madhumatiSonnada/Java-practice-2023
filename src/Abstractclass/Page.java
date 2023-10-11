package Abstractclass;

public abstract class Page
{
	
	public Page()
	{
		System.out.println("Page constructor");
	}
	
	public Page(int a)
	{
		System.out.println("page constructor" +a);
	}
	public abstract void title();
	public abstract void url();
	public void timeout()
	{
		System.out.println("Page timeout");
	}
	public final void logo()
	{
		System.out.println("page logo");
	}
}
