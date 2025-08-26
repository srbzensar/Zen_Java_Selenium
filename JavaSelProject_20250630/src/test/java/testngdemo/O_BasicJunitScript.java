package testngdemo;

//import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.*;



import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class O_BasicJunitScript {

	@BeforeEach
	void setUp() throws Exception {
		System.out.println("Before Method");
	}

	@AfterEach
	void tearDown() throws Exception {
		System.out.println("After Method");
	}

	@Test
	void test1() {
		System.out.println("Test Method1");
		assertEquals("Google", "Google");
	}
	
	@Test
	void test2() {
		System.out.println("Test Method2");
		assertEquals(10, 10);
//		assertEquals("Google", "Google1");
//		assertEquals("Google", "Google1", "Title did not match");
		assertTrue(10==10);
		assertFalse(10==15);
//		fail("fail test");
		
		
	}

}
