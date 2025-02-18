package TestNgAnnotations;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGAnnotations {
  @Test
  public void regis() {
	  System.out.println("Test Method----One");
  }
  
  @Test
  public void login() {
	  System.out.println("Test Method----Two");
  }
  
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("Before Method----Four");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("After Method----Five");
  }

  @BeforeClass
  public void beforeClass() {
	  System.out.println("Before Class----Three");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("After Class----Six");
  }

  @BeforeTest
  public void beforeTest() {
	  System.out.println("Before Test----Two");
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("After Test----Seven");
  }

  @BeforeSuite
  public void beforeSuite() {
	  System.out.println("Before Suite----One");
  }

  @AfterSuite
  public void afterSuite() {
	  System.out.println("After Suite----Eight");
  }

}
