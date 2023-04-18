package certification.tutorials.collection;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class Example06 {

	// Create Set with a array
	public static void main(String[] args) {

		String[] myArray = new String[] { "3", "25", "2", "79", "2"

		};

		Set<String> mySet = new HashSet<String>();
		Collections.addAll(mySet, myArray);
		System.out.println(mySet);
	}

}
