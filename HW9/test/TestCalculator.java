package test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import main.Calculator;


class TestCalculator {

	Calculator calculator = new Calculator();

	@Test
	public void Should_add_two_numbers_and_return_result() {
		assertEquals(20, calculator.add(15, 5));
	}
	
	@ParameterizedTest
	@CsvFileSource(resources = "TestCalculator.csv")
	public void Should_add_two_numbers_and_return_result_parameterized(int valueOne, int valueTwo) {
		assertEquals((valueOne + valueTwo), calculator.add(valueOne, valueTwo), "Regular addition should work and expected output is 20.");
	}
	
	@Test
	public void Should_substract_two_numbers_and_return_result() {
		assertEquals(-1, calculator.sub(5,6));
		assertEquals(1, calculator.sub(-5,-6));
		assertEquals(-11, calculator.sub(-5,6));
		assertEquals(11, calculator.sub(5,-6));
	}
	
	@Test
	public void Should_multiply_two_numbers_and_return_result() {
		assertEquals(20, calculator.multiply(-4,-5));
	}
	
	@Test
	public void Should_divide_two_numbers_and_return_result() {
		assertEquals(5.0, calculator.divide(-10,-2));
	}
	
	@Test
	public void Should_throw_an_arithmetic_exception_if_denominator_is_zero() {
		ArithmeticException e = Assertions.assertThrows(ArithmeticException.class, () -> calculator.divide(7, 0));
		assertEquals("ZeroDivisionError", e.getMessage());
	}
	
}
