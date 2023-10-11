package Webdriverarch;

public class Chrome implements Webdriver
{
	public Chrome()
	{
		System.out.println("launch chrome");
	}

	@Override
	public void findelement(String element) {
		// TODO Auto-generated method stub
		System.out.println("findelement chrome");
	}

	@Override
	public void findelements(String element) {
		// TODO Auto-generated method stub
		System.out.println("findelements chrome");
	}

	@Override
	public void click() {
		// TODO Auto-generated method stub
		System.out.println("click chrome");
	}

	@Override
	public void sendkeys() {
		// TODO Auto-generated method stub
		System.out.println("keys chrome");
	}

	@Override
	public String gettitle() {
		// TODO Auto-generated method stub
		return "title";
	}

	@Override
	public String geturl() {
		// TODO Auto-generated method stub
		return "url";
	}

	@Override
	public void close() {
		// TODO Auto-generated method stub
		System.out.println("close chrome");
	}
}
