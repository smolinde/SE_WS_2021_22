package test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.GregorianCalendar;

import main.Calendar;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

class TestCalendar {
	
	@ParameterizedTest
	@ValueSource(ints = {2000, 2004, 2008, 2012, 2016, 2020, 2024, 2028, 2032, 2036, 2040, 2044})
	public void Should_return_true(int year) {
		Calendar c = new Calendar(year);
		assertEquals(true, c.isLeapYear());
	}

	@ParameterizedTest
	@ValueSource(ints = {2001, 2005, 2009, 2013, 2017, 2021, 2025, 2029, 2033, 2037, 2041, 2045})
	public void Should_return_false(int year) {
		Calendar c = new Calendar(year);
		assertEquals(false, c.isLeapYear());
	}

	@ParameterizedTest
	@ValueSource(ints = {2000, 2005, 2008, 2013, 2016, 2021, 2024, 2029, 2032, 2037, 2040, 2045})
	public void Should_return_if_year_is_leap(int year) {
		GregorianCalendar g = new GregorianCalendar();
		Calendar c = new Calendar(year);
		assertEquals(g.isLeapYear(year), c.isLeapYear());
	}

	@Test
	public void Boundary_Test () {
		Calendar c = new Calendar(1900);
		assertEquals(false, c.isLeapYear());
		c = new Calendar(2400);
		assertEquals(true, c.isLeapYear());
		//c = new Calendar(0);
		//assertEquals(false, c.isLeapYear());
		//c = new Calendar(-1);
		//assertEquals(false, c.isLeapYear());
		// It makes sense to throw an exception in a case of negative year
	}
	@Test
	public void Exception_Handling () {
		final Calendar cal = new Calendar(0);
		ArithmeticException e = Assertions.assertThrows(ArithmeticException.class, () -> cal.isLeapYear());
		assertEquals("Impossible Year", e.getMessage());
	}
	
	
}
