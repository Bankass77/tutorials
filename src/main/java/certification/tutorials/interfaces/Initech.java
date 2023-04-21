package certification.tutorials.interfaces;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * The lambda expression is invalid because the input argument is of type Boss,
 * and Boss does not define an equalsIgnoreCase() method . If the lambda was
 * corrected to use s.toString() instead of s, the code would compile and run
 * without issue, printing [PETER, MICHAEL] at runtime.
 *
 */
public class Initech {
	public static void main(String[] args) {
		final List<Boss> bosses = new ArrayList<>(8);
		bosses.add(new Boss("Peter"));
		bosses.add(new Boss("Samir"));
		bosses.add(new Boss("Michael"));
		bosses.removeIf(s -> s.equalsIgnoreCase("samir"));
		System.out.print(bosses);
	}

}
