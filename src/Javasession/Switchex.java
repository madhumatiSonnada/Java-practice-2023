package Javasession;

public class Switchex 
{

	public static void main(String[] args)
	{
		String browser="Chrome ";
		
		switch (browser.toLowerCase().trim()) 
		//Switch is applicable only for intereger and String
		//we can use break only for switch cases
		//it will directly locate to the chrome case-overcome of if else case
		
		//best example for switch is we case use while running program in diff env
		//qa,uat, production etc env--just change the key value
		{
		case "chrome":
			System.out.println("launch chrome browser");
			break;
		case "firefox":
		System.out.println("launch firefox driver");
		break;
		default:
		System.out.println("Please pass valid browser");
		}
		
		int marks=90;
		switch (marks) 
		{
		case 75: 
		System.out.println("grade c");
		break;
		case 95:
			System.out.println("A++");
			break;
		
		default:
			throw new IllegalArgumentException("Unexpected value: " + marks);
		}
		
	}

}
