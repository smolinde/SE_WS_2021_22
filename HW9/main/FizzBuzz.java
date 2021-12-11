package main;

public class FizzBuzz {
	
	public String convertNumber(int number) {
		if (multipleOfFive(number) && !multipleOfSeven(number)) {
			return "Fizz";
		} else if (!multipleOfFive(number) && multipleOfSeven(number)) {
			return "Buzz";
		} else if (multipleOfFive(number) && multipleOfSeven(number)) {
			return "FizzBuzz";
		} else {
			return null;
		}
	}
	private boolean multipleOfFive (int n) {
		return n % 5 == 0;
	}
	private boolean multipleOfSeven (int n) {
		return n % 7 == 0;
	}
}
