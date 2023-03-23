package certification.tutorials.collections;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Exercice17 {

	public static void main(String[] args) {
		List<Double> array = new ArrayList<Double>();

		array.add(5.0);
		array.add(2.2);
		array.add(37.5);
		array.add(3.1);
		array.add(1.3);
		System.out.println("Original list: " + array);

		ListIterator listIterator = array.listIterator();
		while (listIterator.hasNext()) {
			//   point to next element
			double object = (double) listIterator.next();

			// round up the decimal number

			listIterator.set(Math.round(object));
		}
		System.out.println("Modified list: " + array);

	}

}
