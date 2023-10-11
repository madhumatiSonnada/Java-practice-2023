package Webdriverarch;

public class Firefox implements Webdriver
{
	public Firefox()
	{
		System.out.println("launch Firefox");
	}

	@Override
	public void findelement(String element) {
		// TODO Auto-generated method stub
		System.out.println("findelement Firefox");
	}

	@Override
	public void findelements(String element) {
		// TODO Auto-generated method stub
		System.out.println("findelements Firefox");
	}

	@Override
	public void click() {
		// TODO Auto-generated method stub
		System.out.println("click Firefox");
	}

	@Override
	public void sendkeys() {
		// TODO Auto-generated method stub
		System.out.println("keys Firefox");
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
		System.out.println("close Firefox");
	}
}
