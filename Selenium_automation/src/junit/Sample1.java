package junit;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

public class Sample1 {
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		System.out.println("Hi");
	}
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		System.out.println("bye");
	}
	@Test
	public void test() {
		System.out.println("welcome");
	}
	@Ignore
	@Test
	public void test2() {
		System.out.println("See u later");
	}
}
