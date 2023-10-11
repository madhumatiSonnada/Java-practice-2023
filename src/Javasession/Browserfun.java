package Javasession;

public class Browserfun 
{

	public boolean launchBrowser(String Browser)
	{
			switch (Browser.toLowerCase()) {
			case "chrome":
				System.out.println("launch chrome");
				//break;
				return true;
			case "opera":
				System.out.println("launch opera");
				//break;
				return true;
			case "Firefor":
				System.out.println("launch Firefox");
				//break;
				return true;
			default:
				System.out.println("not found");
				//break;
				return false;
			}
	}
	
	
	
	public static void main(String[] args) 
	{
		
		Browserfun b=new Browserfun();
		b.launchBrowser("Opera");
		boolean d=b.launchBrowser("Chrome");
		System.out.println(d);
		
	}

}
