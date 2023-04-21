package certification.tutorials.lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class LocalOnly {

	public static void main(String[] args) {

		StringBuilder banner = new StringBuilder("love");
		LocalOnly instance = new LocalOnly();
		Predicate<String> p = instance.getPredicate(banner);
		System.out.println(p.test("never dies!") + " " + banner);

	}

	public Predicate<String> getPredicate(StringBuilder banner) {

		List<String> words = new ArrayList<>();
		words.add("Tom");
		words.add("Dick");
		words.add("Harriet");

		// banner = new StringBuilder(); // Illegal: Not effectively final

		// words= new ArrayList<>(); // Illegal: Not effectively final
		return str -> { // Lambda expression

			// String banner= "Don't redeclare me!" // Illegal: Redeclared
			// String words= new String [6] ; // Illegal: Redeclared
			System.out.println("List: " + words);
			banner.append(str);
			return str.length() > 5;
		};

	}
}
