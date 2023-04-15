package com.vik;


import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.*;


//@TestInstance(TestInstance.Lifecycle.PER_METHOD)
class MathUtilsTest {
	
	MathUtils mathUtils;
	
	@BeforeAll
	static void beforeAllInit() {    //This method need to be static
		System.out.println(" Before all...");
	}
	
	@AfterAll
	static void afterAllThings() {    //This method need to be static
		System.out.println(" After all...");
	}
	
	@BeforeEach
	void init() {
		mathUtils = new MathUtils();
	}
	
	@AfterEach
	void cleanup() {
		System.out.println(" clean up");
	}

	@Test
	@DisplayName("Adding Numbers")
	void testAdd() {
		
	
		assertEquals(2, mathUtils.add(  1, 1), "should return add of two numbers");
		
		//Lazy Assert Message
		//assertEquals(2, mathUtils.add(  1, 1), "should return add of two numbers");
		
		
		//assertEquals(expected, actual, "should add two numbers");
		
		//assertArrayEquals(expected, actual);
		//assertIterableEquals(expected, actual);
				
		
	}
	
	@Nested
	@DisplayName("Substarct method")     //optional
	class Substract{
		
		@Test
		@DisplayName("when substracting two positive numbers")  //optional
		void substractPositive() {
			assertEquals(2, mathUtils.substract(5,3));
		}
		
		@Test
		@DisplayName("when substracting two negative numbers")  //optional
		void substractNegative() {
			assertEquals(-2, mathUtils.substract(-5,-3));
		}
	}
	
	
	@Test
	@DisplayName("Multiply Method")
	void testMultiply() {     //assertAll()
		
		assertAll(
				() -> assertEquals(4, mathUtils.multiply(2,2)),
				() -> assertEquals(0, mathUtils.multiply(2,0)),
				() -> assertEquals(-2, mathUtils.multiply(2,-1))
				);
	}
	
	@Test
	void testDivide() {
		//MathUtils mathUtils = new MathUtils();
		assertThrows(ArithmeticException.class, ()-> mathUtils.divide(1, 0), "Divide by zero show throw");
	}
	
	@RepeatedTest(3)
	void testComputeCircularArea(RepetitionInfo repetitionInfo) {
		assertEquals(314.159265358979323846, mathUtils.computeCircularArea(10));
	}
	
	@Test
	@Disabled
	void failTest() {
		fail("Failed...");
	}

}
