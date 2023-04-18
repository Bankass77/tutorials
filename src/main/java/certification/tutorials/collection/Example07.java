package certification.tutorials.collection;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class Example07 {

	public static void main(String[] args) {

		Integer[] myArray = new Integer[] { 3, 25, 2, 79, 2

		};

		Set<Integer> mySet = new HashSet<>();

		Collections.addAll(mySet, myArray);

		System.out.println(mySet);

	}

}
