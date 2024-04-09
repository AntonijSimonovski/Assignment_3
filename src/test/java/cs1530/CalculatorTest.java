package cs1530;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

class CalculatorTest {
	private Calculator calc;
	
	@BeforeEach
	void setUp() throws Exception {
		calc = new Calculator();
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testDivideByZero() {
		double dividend = 10.61;
		double divisor = 0;
		
		assertNotEquals(Double.POSITIVE_INFINITY, calc.divide(Math.abs(dividend),Math.abs(divisor)),"Divide by zero");
	}

	@Test
	void testDivideWithPrecision() {
		double expected = 2.51;
		double actual = calc.divide(5.0, 2.0);
		
		assertEquals(expected, actual, 0.01, "Precision mismatch");
	}

	@Test
	void testMultiply() {
		double expected = 20.0;
		double actual = calc.multiply(new long[]{5L, 4L});
		
		assertEquals(expected, actual, 0.01, "Multiplication result mismatch");
		
		expected = -12.0;
		actual = calc.multiply(new long[]{-3L, 4L});
		
		assertEquals(expected, actual, 0.01, "Multiplication result mismatch with negative numbers");
	}

	@Test
	void testSubtract() {
		long expected = 30 - 60 - (-10);
		long actual = calc.subtract(30,60,-10);
		String msg = "Expected Result: 30 - 60 - (-10) = " + expected;
		assertEquals(expected, actual, msg);
	}

	@Test
	void testAdd() {
		long expected = 30 + 60 + (-10);
		long actual = calc.add(30,60,-10);
		String msg = "Expected Result: 30 + 60 + (-10) = " + expected;
		assertEquals(expected, actual, msg);
		
	}

}
