package e.junitdemo;

//import static org.junit.Assert.assertEquals;
//import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class B_AssertionsEx {

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		System.out.println("Before Class");
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
		System.out.println("After Class");
	}

	@BeforeEach
	void setUp() throws Exception {
		System.out.println("Before Method");
	}

	@AfterEach
	void tearDown() throws Exception {
		System.out.println("After Method");
	}

	@Test
	void test() {
		System.out.println("Test1 method");
		assertEquals("Google", "Google");
//		assertEquals("Google1", "Google");
//		assertEquals("Google1", "Google", "Title did not match");
		assertEquals(10, 10);
		assertTrue(10==10);
		assertFalse(10==15);
//		fail("fail test");
		
	}

}
