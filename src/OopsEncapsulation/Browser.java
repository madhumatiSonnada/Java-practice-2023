package OopsEncapsulation;

public class Browser 
{
	public void launchbrowser()
	{
		System.out.println("Launch the Browser");
		checkRam();
		checkComapatibility();
		checkBrowserversion();
	}
	private void checkRam()
	{
		System.out.println("Checking the RAM");
	}
	private void checkComapatibility()
	{
		System.out.println("Checking the compatibitly");
	}
	private void checkBrowserversion()
	{
		System.out.println("checking Browser version");
	}
}
