package certification.tutorials.stream;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.stream.Stream;

/**
 * 
 * The code does not compile because Stream.concat() takes two parameters, not
 * the three provided. If the extra parameter was removed, flamingo would be
 * printed. The sorting would be necessary to guarantee the order.
 *
 */
public class StreamContactTest {

	public static void main(String[] args) {
		Set<String> birds = Set.of("oriole", "flamingo");
		Stream.concat(birds.stream(), birds.stream()).
		//Stream.concat(birds.stream(), birds.stream(), birds.stream())
		sorted() 
				.distinct().findAny().ifPresent(System.out::println);
	


	}

}
