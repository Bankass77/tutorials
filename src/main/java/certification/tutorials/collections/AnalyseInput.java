package certification.tutorials.collections;

import java.io.Console;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class AnalyseInput {

	public static void main(String[] args) {

		ArrayList<String> text = new ArrayList<String>();
		Console cons;

		String line = "";

		while (!line.equals("*") && (cons = System.console()) != null && (line = cons.readLine()) != null) {

			List<String> lineList = new ArrayList<String>(Arrays.asList(line.split("")));
			text.addAll(lineList);
		}

		System.out.println("You typed: " + text);
		System.out.println("Word count: " + text.size());

		Set<String> textSet = new HashSet<String>();
		textSet.addAll(text);

		Iterator<String> iterator = textSet.iterator();

		List<DataPoint> frequencies = new ArrayList<DataPoint>();

		while (iterator.hasNext()) {

			// point to next element
			String object = (String) iterator.next();

			// get the amount of times this word shows up in the text.
			int freq = Collections.frequency(text, object);

			// Print out the result
			System.out.println(object + "appears" + freq + "times");

			// Create the object to be stored
			DataPoint dataPoint = new DataPoint(object, freq);
			// add datapoints to the list
			frequencies.add(dataPoint);
			System.out.println("Word freq: " + frequencies);
		}

		Collections.sort(frequencies, Collections.reverseOrder(new SortByValue()));
		System.out.println("Result sorted");
		for (int i = 0; i < frequencies.size(); i++) {
			System.out.println(frequencies.get(i).value + "times for word" + frequencies.get(i).key);

		}

	}

}
