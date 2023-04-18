package certification.tutorials.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Activity2 {

	public static void main(String[] args) {

		List<Double> listOfNumbers = new ArrayList<Double>();

		// random creates a number between 0 and 1
		// round removes the decilmal
		// finally we cast it to long

		long numNodes = Math.round(Math.random() * 10_000);
		System.out.println("Total amount of numbers: " + numNodes);

		// create random number between 0 to 100 and add it to listOfNumbers

		for (int i = 0; i < numNodes; i++) {
			listOfNumbers.add(Math.random() * 100);
		}
		Double avg = 0.0;
		Iterator iterator = listOfNumbers.iterator();

		while (iterator.hasNext()) {

			avg += (Double) iterator.next() / numNodes;

		}
		System.out.println("avg: " + avg);
	}

}
