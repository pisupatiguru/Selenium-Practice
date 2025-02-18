package TestNgAnnotations;

import org.testng.annotations.Test;

public class groupConcept {
  @Test(groups="include")
  public void m1_groupConcept() {
	  System.out.println("include group get executed");
  }
  
  @Test(groups="exclude")
  public void m2_groupConcept() {
	  System.out.println("exclude from execution");
  }
  
  @Test(groups={"include","exclude"})
  public void m3_groupConcept() {
	  System.out.println("include and exclude group get executed");
  }
  
  @Test(groups="exclude")
  public void m4_groupConcept() {
	  System.out.println("exclude from execution");
  }
}
