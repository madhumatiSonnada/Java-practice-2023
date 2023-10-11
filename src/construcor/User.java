package construcor;

import java.util.ArrayList;

public class User 
{
	String name;
	int age;
	ArrayList<String> devicelist;
	String[] orders;
	public User(String name, int age, ArrayList<String> devicelist)
	{
		this.name = name;
		this.age = age;
		this.devicelist = devicelist;
	}
	public User(String name, int age, ArrayList<String> devicelist, String[] orders) {
		
		this.name = name;
		this.age = age;
		this.devicelist = devicelist;
		this.orders = orders;
	}
	
	
}
