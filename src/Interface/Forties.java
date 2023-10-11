package Interface;

public class Forties implements Ukmedical,Usmedical,Indiamedical
{
	
	@Override
	public void cardiologists() {
		// TODO Auto-generated method stub
		System.out.println("Cardio");
	}

	@Override
	public void dermatologists() 
	{
		System.out.println("Dermatologists");
		
	}

	@Override
	public void nurses() {
		// TODO Auto-generated method stub
		System.out.println("nurses");
	}

	@Override
	public void dietians() {
		// TODO Auto-generated method stub
		System.out.println("Dietians");
	}

	@Override
	public void psychologists() {
		// TODO Auto-generated method stub
		System.out.println("psychologists");
	}

	@Override
	public void therapists() {
		// TODO Auto-generated method stub
		System.out.println("therapists");
	}

	@Override
	public void podiatrists() {
		// TODO Auto-generated method stub
		System.out.println("podiatrists");
	}

	@Override
	public void emergencydepartment() {
		// TODO Auto-generated method stub
		System.out.println("Emergency dept");
	}
	public void surgeons()
	{
		System.out.println("Surgeons");
	}

	@Override
	public void training() {
		System.out.println("training");
		
	}

	@Override
	public void screening() {
		// TODO Auto-generated method stub
		System.out.println("screening");
		
	}
	@Override
	public void Testing()
	{
		System.out.println("default testing");
	}
	
	public void medicalinfra()
	{
		System.out.println("Forties medical infrastructure");
	}
}
