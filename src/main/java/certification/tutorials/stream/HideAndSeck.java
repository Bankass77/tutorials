package certification.tutorials.stream;

import java.util.function.Predicate;
import java.util.stream.Stream;

public class HideAndSeck {
	public class HideAndSeek {
		public static void main(String[] args) {
			var hide = Stream.of(true, false, true);
			Predicate<Boolean> pred = b -> b;
			var found = hide.filter(pred).allMatch(pred);
			System.out.println(found);
		}
	}

}
