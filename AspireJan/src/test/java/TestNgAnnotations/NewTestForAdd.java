package TestNgAnnotations;

import org.testng.Assert;
import org.testng.annotations.Test;

public class NewTestForAdd {
	CalculatorAdd caladd = new CalculatorAdd();
	
	@Test
	public void f() {
		Assert.assertEquals(10, caladd.add(5, 5));
		Assert.assertTrue(true, "Second Assertion");  
		Assert.assertEquals("apple", "orange"); 
		Assert.assertFalse(true); 
		Assert.assertNull(null);
	}
	

}
