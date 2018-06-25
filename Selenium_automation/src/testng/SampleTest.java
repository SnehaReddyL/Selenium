package testng;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class SampleTest {
  @Test
  public void f() {
	  System.out.println("this is test medthod");
  }
  @BeforeTest
  public void beforeTest() {
	  System.out.println("hi...");
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("bye...");
  }

}
