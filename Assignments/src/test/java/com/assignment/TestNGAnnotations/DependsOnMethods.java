package com.assignment.TestNGAnnotations;

import org.testng.annotations.Test;

//You have three test methods: testLogin(), testAddToCart(), and testCheckout(). 
//The testAddToCart() method should only execute if testLogin () passes, and testCheckout() 
//should only run if testAddToCart() passes. How would you implement this using the dependsOnMethods 
//feature in TestNG? 
public class DependsOnMethods {
  @Test
  public void testLogin() {
	  System.out.println("Test Login Successful");
  }
  @Test(dependsOnMethods = {"testLogin"})
  public void testAddToCart() {
	  System.out.println("Test Add to Cart Successful");
  }
  @Test(dependsOnMethods = {"testAddToCart"})
  public void testCheckout() {
	  System.out.println("Test Checkout Successful");
  }
}
