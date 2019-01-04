package com.mycompany.calculator;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class CalculatorTest {
	private Calculator calculator;

	@Before
	public void setUp() {
		calculator = new Calculator();
	}

	@Test
	public void additionTestCase() {
		assertEquals(130, calculator.addition(70, 60),0.0);
	}

	@Test
	public void subtractionTestCase() {
		assertEquals(10, calculator.subtraction(70, 60),0.0);
	}
	@Test
	public void multiplocationTestCase() {
		assertEquals(4200, calculator.multiplication(70, 60),0.0);
	}
	@Test
	public void divisionTestCase() {
		assertEquals(7, calculator.division(70, 10),0.0);
	}

}
