package TestNgAnnotations;

import org.testng.annotations.Test;

public class ClassOne {
	 @Test
	  public void f1() {
		  System.out.println("Class One  f1 execution "+Thread.currentThread().getId());
	  }
	  @Test
	  public void f2() {
		  System.out.println("Class One f2 execution "+Thread.currentThread().getId());
	  }
	  @Test
	  public void f3() {
		  System.out.println("Class One f3 execution "+Thread.currentThread().getId());
	  }
	  @Test
	  public void f4() {
		  System.out.println("Class One f4 execution "+Thread.currentThread().getId());
	  }
}
