package certification.tutorials.stream;

import java.util.List;

/**
 * 
 * The code does not compile. The problem here is that c1 is an Integer and c2
 * is a String, so the code fails to combine on line q2, since calling length()
 * on an Integer is not allowed, The rest of the lines compile without issue.
 * Note that calling parallel() on an already parallel stream is allowed, and it
 * may return the same object.
 *
 */
public class ReduceTest {

	public static void main(String[] args) {
		System.out.print(List.of("duck", "flamingo", "pelican").parallelStream().parallel() // q1
				.reduce(0, (c1, c2) -> c1.length() + c2.length(), // q2
						(s1, s2) -> s1 + s2)); // q3

	}

}
