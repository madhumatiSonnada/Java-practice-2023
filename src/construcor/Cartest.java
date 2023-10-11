package construcor;

public class Cartest {

	public static void main(String[] args) {
	Car c1=new Car("Honda", 15);
	System.out.println(c1.name+"   "+c1.price);
	Car c2=new Car("Benz", 20, "I10", "Blue");
	System.out.println(c2.name+" "+c2.price+" "+ c2.model+"  "+c2.color);
	System.out.println(Car.wheel);
	}

}
