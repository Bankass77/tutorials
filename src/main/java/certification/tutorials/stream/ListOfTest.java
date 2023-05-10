package certification.tutorials.stream;

import java.io.IOException;
import java.util.List;

/**
 * 
 * Notice that the inner for-each loop does not use braces, {}, so the break
 * statement applies to the outer loop only. On the first iteration of the outer
 * loop, the inner loop prints 17_JDK and 17_Java. Then, the break statement is
 * encountered, and the outer loop is terminated
 *
 */
public class ListOfTest {

	public static void main(String[] args) throws IOException {

		final var javaVersions = List.of(17, 11, 8);
		var names = List.of("JDK", "Java");
		V: for (var e1 : javaVersions) {
			E: for (String e2 : names) 
				System.out.println(e1 + "_" + e2);
				break;

			
		}
	}
}
