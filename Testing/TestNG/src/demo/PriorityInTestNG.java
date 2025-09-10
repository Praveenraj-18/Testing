package demo;

import org.testng.SkipException;
import org.testng.annotations.Test;

public class PriorityInTestNG {
  @Test(priority = 4)
  public void f1() {
	  throw new SkipException("no need to run");
	 // System.out.println("Hi this is f1");
  }
  @Test(priority = 1)
  public void f2() {
	  System.out.println("Hi this is f2");
}
  @Test(priority = 2)
  public void f3() {
	  System.out.println("Hi this is f3");
  }
  @Test(priority = 3)
  public void f4() {
	  System.out.println("Hi this is f4");
  }
}