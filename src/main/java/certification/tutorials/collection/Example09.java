package certification.tutorials.collection;

import java.util.Collections;
import java.util.Set;
import java.util.TreeSet;

public class Example09 {

	public static void main(String[] args) {

		// the intersection operation entre deux collections
		Integer[] number1 = new Integer[] { 3, 25, 2, 79, 2

		};

		Integer[] number2 = new Integer[] { 7, 12, 14, 79

		};

		Set set1 = new TreeSet();
		Collections.addAll(set1, number1);

		Set set2 = new TreeSet();

		Collections.addAll(set2, number2);
		set1.retainAll(set2);
		System.out.println(set1);
	}

}
