package Hashmap;

import java.util.HashMap;

public class Haspmap 
{

	public static void main(String[] args)
	{
		HashMap<String,Integer> map=new HashMap<String,Integer>();
		map.put("madhu", 100);
		map.put("mati", 200);
		map.put("Hanu", 300);
		map.put("Swarna", 500);
		map.put(null, 10);
		map.put("abc", null);
		map.put("madhu",900);//update with latest value
		System.out.println(map.get("madhu"));//before 100 and later 900
		System.out.println(map.get("null"));
		System.out.println(map.get("abc"));
		map.forEach((k,v) -> System.out.println(k + ":" +v));
		
	}

}
