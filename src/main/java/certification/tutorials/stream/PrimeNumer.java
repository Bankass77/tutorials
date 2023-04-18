package certification.tutorials.stream;

import java.util.function.IntPredicate;
import java.util.stream.IntStream;

public class PrimeNumer {

	public static Boolean isPrime(Integer number) {

		if (number == 1) {

			return false;
		}
		return IntStream.range(2, number).noneMatch(i -> number % i == 0);
	}

	public static Integer sumOfFirstNPrimes(Integer counInteger) {
		return IntStream.iterate(1, i -> i + 1).filter(j -> isPrime(j)).limit(counInteger).sum();

	}

	/*
	 * public static Integer isEven(Integer number) { return IntStream.iterate(1, i
	 * -> i + 1).filter(j -> isPrime(j)).limit(number).sum();
	 * 
	 * }
	 */

	// Let’s write a function to check whether the number is even

	public static Boolean isEven(Integer number) {
		return number % 2 == 0;
	}

	/**
	 * 
	 * @param number
	 * @return The negation of isEven tells us whether the number is odd. We can
	 *         have functions to find the sum of the first N even numbers and the
	 *         first N odd numbers
	 */
	public static Integer sumOfFirstNEvens(Integer number) {

		return IntStream.iterate(1, i -> i + 1).filter(j -> isEven(j)).limit(number).sum();
	}

	public static Integer sumOfFirstNOdds(Integer number) {
		return IntStream.iterate(1, i -> i + 1).filter(j -> !isEven(j)).limit(number).sum();
	}

	Integer computeFirstNSum(Integer numInteger, IntPredicate filIntPredicate) {
		return IntStream.iterate(1, i -> i + 1).filter(filIntPredicate).limit(numInteger).sum();

	}

	public static void main(String[] args) {

		System.out.println(isPrime(5));

		System.out.println(sumOfFirstNPrimes(5));
		System.out.println(isEven(5));
		
	}
}
