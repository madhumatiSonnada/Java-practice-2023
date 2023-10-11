package construcor;

public class Car
{
	String name;
	int price;
	String model;
	String color;
	static final int wheel=4;
	
	public Car(String name, int price) {
		
		this.name = name;
		this.price = price;
	}
	public Car(String name, int price, String model) {
		
		this.name = name;
		this.price = price;
		this.model = model;
	}
	public Car(String name, String color) {
	
		this.name = name;
		this.color = color;
	}
	public Car(String name, int price, String model, String color) {
		
		this.name = name;
		this.price = price;
		this.model = model;
		this.color = color;
	}
	
	
}
