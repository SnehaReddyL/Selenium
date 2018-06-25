package junit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class Sample {

	@Before
	public void setUp() throws Exception {
		System.out.println("Hi");
	}
	@After
	public void tearDown() throws Exception {
		System.out.println("bye");
	}
	@Test
	public void test1() {
		System.out.println("welcome");
	}
	@Test
	public void test2() {
		System.out.println("See u later");
	}

}
