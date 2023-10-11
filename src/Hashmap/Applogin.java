package Hashmap;
import java.util.HashMap;

public class Applogin {
	
	public static void main(String[] args) {
		
		Applogin.getcred("Customer");
		Applogin.getcred("dev");
	}
		public static void getcred(String role)
		{
		HashMap<String,String> mp=new HashMap<String,String>();
		mp.put("Customer", "tmsonnad@gmail.com:tmsonnad");
		mp.put("Testing", "mati@gmail.com:mati2023");
		mp.put("dev", "swapna@gmail.com:swapna123");
		
		String cred=mp.get(role);
		String username=cred.split(":")[0];
		String password=cred.split(":")[1];
		login(username, password);
		}
		
		public static void login(String username,String password)
		{
			System.out.println("user name is " +username);
			System.out.println("password is  "+password);
			System.out.println("Login is done");
		}

}
