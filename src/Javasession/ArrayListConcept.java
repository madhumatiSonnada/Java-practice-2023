package Javasession;

import java.util.ArrayList;

public class ArrayListConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList ar=new ArrayList();
		ar.add(10);
		ar.add("Madhu");
		ar.add('f');
		ar.add(10.55);
		System.out.println("Size of the array is  " +ar.size());
		System.out.println(ar.get(1));
		for(int i=0;i<ar.size();i++)
		{
			System.out.println(ar.get(i));
		}
		System.out.println("For each loop");
		for(Object e:ar)//since we are storing all kind of data so we have to use Object data type
		{
			System.out.println(e);
		}
		//Generics
		ArrayList<Integer> al=new ArrayList<Integer>();
		//al.add("madhu");//it will give an error since we are trying to store string data type
		al.add(20);
		al.add(300);
		al.add(40);
		al.add(500);
		al.add(60);
		System.out.println("Size of the array  "+al.size());//5
		System.out.println("2nd element" +al.get(2));//40
		for(int r:al)
		{
			System.out.println(r);
		}
		al.remove(2);//40 removed and 500 shifted to 2nd position
		System.out.println("Size  "+al.size() );//4
		System.out.println("2nd element  "+al.get(2));//500
		
		ArrayList<String> al1=new ArrayList<String>();
		al1.add("madhu");
		al1.add("mati");
		al1.add("Hanu");
		al1.add("sonnad");
		
		for(int j=0;j<al1.size();j++)
		{
			System.out.println(al1.get(j));
		}
		
	}

}
