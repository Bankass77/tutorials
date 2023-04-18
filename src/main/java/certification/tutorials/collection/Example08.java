package certification.tutorials.collection;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Example08 {

	public static void main(String[] args) {

		Integer[] number1 = new Integer[] { 3, 25, 2, 79, 2

		};

		Integer[] number2 = new Integer[] { 7, 12, 14, 79

		};

		Set set1 = new HashSet();

		Set set11 = new TreeSet();
		Collections.addAll(set1, number1);
		Collections.addAll(set11, number1);

		Set set2 = new HashSet();
		Set set22 = new TreeSet();

		Collections.addAll(set2, number2);
		Collections.addAll(set22, number2);

		set1.addAll(set2);
		set11.addAll(set22);
		System.out.println("set is  with HashSet: " + set1);
		System.out.println("-----------------------");
		System.out.println("set is  with TreeSet: " + set11);

	}

}
