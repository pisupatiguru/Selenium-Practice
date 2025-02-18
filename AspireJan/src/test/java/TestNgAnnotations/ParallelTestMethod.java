package TestNgAnnotations;

import org.testng.annotations.Test;

public class ParallelTestMethod {
  @Test
  public void f1() {
	  System.out.println("f1 execution "+Thread.currentThread().getId());
  }
  @Test
  public void f2() {
	  System.out.println("f2 execution "+Thread.currentThread().getId());
  }
  @Test
  public void f3() {
	  System.out.println("f3 execution "+Thread.currentThread().getId());
  }
  @Test
  public void f4() {
	  System.out.println("f4 execution "+Thread.currentThread().getId());
  }
}
