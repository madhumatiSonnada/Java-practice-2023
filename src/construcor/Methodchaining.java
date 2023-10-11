package construcor;

public class Methodchaining {
	public void t1()
	{
		System.out.println("calling t1");
		t2();
	}
	public void t2()
	{
		System.out.println("calling t2");
		t3();
	}
	public void t3()
	{
		System.out.println("calling t3");
		t1();
	}

	public static void main(String[] args) {
		Methodchaining m=new Methodchaining();
		m.t1();
		m.t2();
		m.t3();
	}
//output-Stackoverflow
}
