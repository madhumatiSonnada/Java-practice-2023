package Webdriverarch;

public class Testapp {
	static Webdriver driver;
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		//Chrome c=new Chrome();
		//c.click();
		//c.geturl();
		//c.gettitle();
		//c.findelement("email");
		String browser="Firefox";
		if(browser.equals("Chrome"))
		{
			driver=new Chrome();
		}
		else if(browser.equals("Firefox"))
		{
			driver=new Firefox();
		}
		else
		{
			System.out.println("entered browser not availbale");
		}
		driver.click();
		driver.gettitle();
		driver.geturl();
		driver.findelement("email");
		driver.findelements("psws");
		driver.close();
		
	}

}
