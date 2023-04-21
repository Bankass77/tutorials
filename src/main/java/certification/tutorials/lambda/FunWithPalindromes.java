package certification.tutorials.lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class FunWithPalindromes {

	public static void main(String[] args) {

		List<String> words = new ArrayList<>();
		words.add("Otto");
		words.add("ADA");
		words.add("Alyla");
		words.add("Bob");
		words.add("HannaH");
		words.add("Java");

		System.out.println("list of words: " + words);

		System.out.println("---------------Using Anonymous Classes----------------------");
		// Use an anonymous class to filter for palindromes (case sensitives)
		List<String> palindromeA = filterList(words, new Predicate<String>() {

			@Override
			public boolean test(String arg0) {

				return arg0.equals(new StringBuilder(arg0).reverse().toString());
			}
		});

		System.out.println();
		System.out.println("case sensitives palindrome:    " + palindromeA);

		// Use anonymous classe to filter for palindromes (case insensitive)

		List<String> palindromeB = filterList(words, new Predicate<String>() {

			@Override
			public boolean test(String arg0) {

				return arg0.equalsIgnoreCase(new StringBuilder(arg0).reverse().toString());
			}
		});

		System.out.println("Case insensitive palindrome:    " + palindromeB);

		System.out.println();
		System.out.println("-----------Using Lambda Expressions");

		Predicate<String> predicate1 = str -> str.equals(new StringBuilder(str).reverse().toString());
		List<String> palindrome1 = filterList(words, predicate1);
		System.out.println("Case-sensitive palindromes: " + palindrome1);

		Predicate<String> predicate2 = str -> str.equalsIgnoreCase(new StringBuilder(str).reverse().toString());
		List<String> palindrome2 = filterList(words, predicate2);

		System.out.println("Case-insensitive palindromes: " + palindrome2);
	}

	private static List<String> filterList(List<String> words, Predicate<String> predicate) {

		List<String> result = new ArrayList<>();

		for (String e : words) {

			if (predicate.test(e)) {
				result.add(e);
			}

		}

		return result;
	}

}
