package OopsEncapsulation;

public class Testuser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		User u=new User("madhu","Sonnada",20);
		System.out.println( u.getFirstname());
		System.out.println(u.getAge());
		u.getLastname();
		u.getUserprofile();
		u.setAge(28);
		u.getUserprofile();

	}

}
