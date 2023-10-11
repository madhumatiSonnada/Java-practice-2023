package Interface;

public interface Ukmedical 
{
	int fee=10;
	public void therapists();
	public void podiatrists();
	public void emergencydepartment();
	public static void test()
	{
		System.out.println("Testing");
	}
	default void Testing()
	{
		System.out.println("Default method");
	}
}
