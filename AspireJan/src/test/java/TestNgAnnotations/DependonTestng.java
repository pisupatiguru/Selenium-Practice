package TestNgAnnotations;

import static org.testng.Assert.fail;

import org.testng.annotations.Test;

public class DependonTestng {
	
	@Test(dependsOnMethods= {"regis"})
	public void login()
	{
		System.out.println("login regis success");
	}

	@Test(dependsOnMethods= {"login"})
	public void search()
	{
		System.out.println("Search");
	}
	
	@Test
	public void regis()
	{
		System.out.println("regis");
		fail();

	}
}
