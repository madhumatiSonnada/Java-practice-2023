package construcor;

public class Callbyvaluereference 
{
	String name;
	int age;
	public void add(int a,int b)
	{
		System.out.println(a+b);
	}
	
	public void sendMail(Callbyvaluereference t1)
	{
		System.out.println(t1.name);
		System.out.println(t1.age);
	}
	public static void main(String[] args) 
	{
		Callbyvaluereference c=new Callbyvaluereference();
		c.add(10, 20);//call by value
		c.name="madhu";
		c.age=25;
		c.sendMail(c);
	}

}
