package demo;

import org.testng.annotations.Test;

public class TestNgGroupDemo {
  @Test(groups={"even"})
  public void f() {
	  System.out.println("f");
  }
  @Test(groups={"odd"})
  public void f1() {
	  System.out.println("f1");
  }
  @Test(groups={"even"})
  public void f2() {
	  System.out.println("f2");
  }
  @Test(groups={"odd"})
  public void f3() {
	  System.out.println("f3");
  }
  @Test(groups={"even"})
  public void f4() {
	  System.out.println("f4");
  }
  @Test(groups={"odd"})
  public void f5() {
	  System.out.println("f5");
  }
}
