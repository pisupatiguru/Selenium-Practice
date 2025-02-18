package TestNgAnnotations;

import org.testng.annotations.Test;

public class ClassTwo {
	 @Test
	  public void f1() {
		  System.out.println("Class Two f1 execution "+Thread.currentThread().getId());
	  }

}
