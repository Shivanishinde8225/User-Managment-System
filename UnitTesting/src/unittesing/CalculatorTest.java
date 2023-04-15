package unittesing;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CalculatorTest extends Calculator {
	Calculator calculator;
	@BeforeEach
	void setUp() throws Exception {
		calculator = new Calculator();
	}

	@AfterEach
	void tearDown() throws Exception {
		calculator = null;
	}

	@Test
	void test() {
		assertEquals(4, calculator.mul(4, 1));
	}
	@Test
	void test1() {
		assertEquals(3,calculator.add(2, 1));
	}

}
