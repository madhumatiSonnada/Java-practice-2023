package Inheritance;

public class Test
{

	public static void main(String[] args) 
	{
		BMW b=new BMW();
		b.start();//overriden
		b.stop();//inherited
		b.autopark();//individual method
		b.refuel();//inherited
		b.engin();//overriden from grandparent
		
		BMW.speed();
		Car.speed();
		Car c=new Car();
		c.start();
		c.stop();
		c.refuel();
		
		Car cb=new BMW();
		cb.start();
		cb.stop();
		cb.refuel();
		
		//BMW bc=(BMW) new Car();//ClassCastException--We cannot downcast from parent to child
		//cb.start();
		
		Vehicle v=new Car();
		v.engin();
		
	}

}
