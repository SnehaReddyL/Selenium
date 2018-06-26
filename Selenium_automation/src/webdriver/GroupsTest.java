package webdriver;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

public class GroupsTest {
  @Test(groups="hi")
  public void f() {
	  System.out.println("hi");
  }
  @Test(groups="bye")
  public void g() {
	  System.out.println("bye");
  }
  @BeforeTest
  public void beforeTest() {
  }

}
