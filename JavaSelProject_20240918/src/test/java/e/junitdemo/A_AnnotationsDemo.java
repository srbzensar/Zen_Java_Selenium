package e.junitdemo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class A_AnnotationsDemo {

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
	void test1() {
//		fail("Not yet implemented");
		System.out.println("Test1 method");
	}
	
	@Test
	void test2() {
		System.out.println("Test2 method");
	}

}
