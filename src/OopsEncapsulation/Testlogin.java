package OopsEncapsulation;

public class Testlogin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Loginpage lp=new Loginpage();
		//post
		lp.setUsername("madhumati");
		lp.setPassword("Hanu");
		//get
		lp.dologin(lp.getUsername(), lp.getPassword());
//to set the password
		lp.setPassword("Hanuma");
		lp.dologin(lp.getUsername(), lp.getPassword());
	}

}
