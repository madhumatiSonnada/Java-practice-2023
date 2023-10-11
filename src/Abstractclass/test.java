package Abstractclass;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Homepage hp=new Homepage(10);
		hp.title();
		hp.url();
		hp.timeout();
		hp.logo();
		hp.login();
		
		Page p=new Homepage();
		p.title();
		p.url();
		p.timeout();
		p.logo();
		
		Loginpage lp=new Loginpage();
		lp.timeout();
		lp.title();
		lp.url();
	lp.logo();
		
	}

}
