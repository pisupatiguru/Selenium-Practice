package TestNgAnnotations;

import org.testng.annotations.Test;

public class IgnoreTest {
	@Test
	public void f1() {
		System.out.println("f1");
	}

	@Test(enabled = false)
	public void f2() {
		System.out.println("f2");
	}

	@Test
	public void f3() {
		System.out.println("f3");
	}
}
