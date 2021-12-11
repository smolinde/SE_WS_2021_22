package test;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import main.FizzBuzz;

class TestFizzBuzz {

	FizzBuzz fizzbuzz = new FizzBuzz();
	
	@ParameterizedTest
	@ValueSource(ints = {5, 25, 50, 55, 75, 100})
	public void Should_return_Fizz_if_multipleOfFive_and_not_multipleOfSeven(int number) {
		var result = fizzbuzz.convertNumber(number);
		var expectedResult = "Fizz";
		
		assertEquals(expectedResult, result);
	}
	
	@ParameterizedTest
	@ValueSource(ints = {7, 49, 84, 91, 98, 28})
	public void Should_return_Buzz_if_mutipleOfSeven_and_not_multipleOfFive(int number) {
		var result = fizzbuzz.convertNumber(number);
		var expectedResult = "Buzz";
		
		assertEquals(expectedResult, result);
	}
	
	@ParameterizedTest
	@ValueSource(ints = {35, 140, 280, 1120, 70, 105})
	public void Should_return_FizzBuzz_if_mutipleOfFive_and_multipleOfSeven(int number) {
		var result = fizzbuzz.convertNumber(number);
		var expectedResult = "FizzBuzz";
		
		assertEquals(expectedResult, result);
	}

}
