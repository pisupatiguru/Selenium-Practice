package TestNgAnnotations;

import org.testng.annotations.Test;

public class TestNgPriority {
	
	@Test(priority=2)
	public void login()
	{
		System.out.println("login");
	}
	@Test(priority=4)
	public void itemcheckout()
	{
		System.out.println("Checkout");
	}
	@Test(priority=3)
	public void search()
	{
		System.out.println("Search");
	}
	
	@Test(priority=1)
	public void regis()
	{
		System.out.println("regis");
	}
}
