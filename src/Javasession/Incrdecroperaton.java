package Javasession;

public class Incrdecroperaton {

	public static void main(String[] args)
	{
		//post increament
		int x=10;
		int y=x++;
		//First x will be assigned to y and it wil increase by 1 so x will become 11 and y will be 10 only
		System.out.println("The value of x is "+x);//11
		System.out.println("The value of y is "+y);//10
		
		int a=-5;
		int b=a++;
		System.out.println(a);//-4
		System.out.println(b);//-5
		
		//pre increament-First h value will increament and it assign to i and the value of h becomes 21
		int h=20;
		int i=++h;
		
		System.out.println(h);//21
		System.out.println(i);//21
		
		//post decreament
		
		int k=100;
		int l=k--;
		System.out.println(k);//99
		System.out.println(l);//100
		
		//pre decreament
		int c=50;
		int d=--c;
		System.out.println(c);//49
		System.out.println(d);//49
	}

}
