package TestNgAnnotations;

import org.testng.annotations.Test;

public class IgnoreTest {
	@Test
	public void TestA() {
		System.out.println("Test A Not Ignored");
	}

	@Test(enabled = false)
	public void TestB() {
		System.out.println("Test B Ignored");
	}

	@Test
	public void TestC() {
		System.out.println("Test C Not Ignored");
	}
}
