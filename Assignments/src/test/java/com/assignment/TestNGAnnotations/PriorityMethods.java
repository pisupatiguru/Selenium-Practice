package com.assignment.TestNGAnnotations;

import org.testng.annotations.Test;

public class PriorityMethods {
	
//	You have three test methods: testA (), testB (), and testC ().
//	You want testC () to execute first, followed by testA (), and then testB (). 
  @Test(priority = 2)
  public void testA() {
	  System.out.println("Test A priority 2");
  }
  @Test(priority = 3)
  public void testB() {
	  System.out.println("Test B priority 3");
  }
  @Test(priority = 1)
  public void testC() {
	  System.out.println("Test C priority 1");
  }
}
