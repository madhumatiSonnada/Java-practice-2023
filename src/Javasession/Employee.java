package Javasession;

public class Employee
{
//class-blueprint/Template
	//object:Physical entity
	//data members of the class
	String name;
	int age;
	double sal;
	boolean IsActive;
	char gendar;
	
	public static void main(String[] args) 
	{
		Employee e1=new Employee();
		e1.name="madhu";
		e1.age=25;
		e1.sal=10.45;
		e1.gendar='F';
		e1.IsActive=true;
		
		System.out.println(e1.name+"  "+e1.age+"  "+e1.sal+"  "+e1.gendar+"  "+e1.IsActive);
		new Employee().name="sonnad";//no reference object -this is eligible for garbage collector
		
		Employee e2=new Employee();
		System.out.println(e2.name+"  "+e2.age+"  "+e2.sal+"  "+e2.gendar+"  "+e2.IsActive);
		//displays default values
		
		Employee e3=new Employee();
		e3.name="peter";
		e3.age=30;
		e3.sal=23.55;
		e3.gendar='m';
		e3.IsActive=true;
		
		System.out.println(e3.name);//peter
		
		//e3=null;//now e3 is pointing to null so we are getting nullpointerexception
		System.out.println(e3.name);//Nullpointerexception
		e2=e1;//one reference can point to another reference
		e3=e2;
		System.out.println(e1.name+"  "+e1.age+"  "+e1.sal+"  "+e1.gendar+"  "+e1.IsActive);
		System.out.println(e2.name+"  "+e2.age+"  "+e2.sal+"  "+e2.gendar+"  "+e2.IsActive);
		System.out.println(e3.name+"  "+e3.age+"  "+e3.sal+"  "+e3.gendar+"  "+e3.IsActive);
		
		//No reference objects and null pointer objects are eligible for the garbage collector
	}
	
	

}
