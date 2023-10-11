package Buliderpattern;

public class EcomApp 
{
	public EcomApp login()
	{
		System.out.println("Loggin");
		return this;
	}
	public EcomApp login(String un,String pswd)
	{
		System.out.println("Logged in with username and password");
		return this;
	}
	public EcomApp searchproduct()
	{
		System.out.println("Searching the product");
		return this;
	}
	public EcomApp addtoCard()
	{
		System.out.println("Adding to the card");
		return this;
	}
	public EcomApp doPayment(String db,int OTP)
	{
		System.out.println("Payment");
		return this;
		
	}
	public EcomApp logout()
	{
		System.out.println("Logged out");
		return this;
	}
}
