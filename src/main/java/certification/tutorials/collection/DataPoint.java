package certification.tutorials.collection;

import java.util.Comparator;

public class DataPoint {

	String key = "";
	Integer value = 0;

	public DataPoint(String key, Integer value) {
		super();
		this.key = key;
		this.value = value;
	}

	public static SortByValue[] sortByValues = { new SortByValue() };

	public static class SortByValue implements Comparator<DataPoint> {

		// Used for sorting in ascending order
		@Override
		public int compare(DataPoint o1, DataPoint o2) {

			return o1.value - o2.value;
		}

	}

}
