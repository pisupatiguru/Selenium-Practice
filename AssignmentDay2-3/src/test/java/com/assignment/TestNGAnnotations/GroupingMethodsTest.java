package com.assignment.TestNGAnnotations;

import org.testng.annotations.Test;

public class GroupingMethodsTest {
//You want to group your tests into two categories: S-smoke and R-regression. 
//How would you group the tests for testA () -S, testB ()-R, and testC ()-S, and then run only the 
//smoke tests using TestNG? 
  @Test(groups = "SomkeTests")
  public void testA () {
	  System.out.println("Smoke Test execution");
  }
  @Test(groups = "RegressionTests")
  public void testB () {
	  System.out.println("Regression Test execution");
  }
  @Test(groups = "SomkeTests")
  public void testC () {
	  System.out.println("Smoke Test execution");
  }
}
