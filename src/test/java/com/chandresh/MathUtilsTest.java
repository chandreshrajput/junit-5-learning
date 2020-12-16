package com.chandresh;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assumptions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.condition.EnabledOnOs;
import org.junit.jupiter.api.condition.OS;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class MathUtilsTest {
	
	MathUtils mathUtils;
	
	@BeforeAll
	   void beforeAll()
	{
		System.out.println("this needs to run before all");
	}
	
	@BeforeEach
	void init()
	{
		mathUtils=new MathUtils();
		System.out.println("hi chandresh");
	}
	@AfterEach
	void cleanUp()
	{
		System.out.println("clean up");
	}

	@Test
	@DisplayName("testing add method")
	public void testAdd() {
	//	MathUtils mathUtils = new MathUtils();
		int expected = 5;
		int actual = mathUtils.add(3, 2);
		// assertEquals(expected, actual);
		assertEquals(expected, actual, " add method should add two no.");

	}

	@Test
 //	@EnabledOnOs(OS.LINUX)
	public void testDivide() {
	//	MathUtils mathUtils = new MathUtils();
		boolean value=false;
		assumeTrue(value);
		assertThrows(NullPointerException.class, () -> mathUtils.divide(5, 0),
				"divide by zero should throw arithematic exception");

	}

	@Test
	public void testComputeCircleArea() {
	//	MathUtils mathUtils = new MathUtils();
		assertEquals(314.514, mathUtils.computeCircleArea(10), 1.0);

	}
	
	@Test
//	@DisplayName("don't include this method")
	@Disabled
	@DisplayName("don't include this method")
	void testDisabled()
	{
		System.out.println("this test should be disabled");
	}

}
