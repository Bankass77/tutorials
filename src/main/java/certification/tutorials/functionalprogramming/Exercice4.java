package certification.tutorials.functionalprogramming;

import java.util.ArrayList;
//import java.util.Comparator;
import java.util.List;

public class Exercice4 {

	public static void main(String[] args) {

		List<Tire> tires = List.of(new Tire(17), new Tire(16), new Tire(15), new Tire(14), new Tire(13), new Tire(18));

		// Comparator<Tire> sorterComparator = (t1, t2) -> t1.size - t2.size;

		// List<Tire> sorted= new ArrayList<Tire>(tires);
		// tires.sort(sorterComparator);

		List<Tire> sorted = getSortedList(tires);
		System.out.println(sorted);

	}

	private static List<Tire> getSortedList(List<Tire> tires) {
		List<Tire> sorted = new ArrayList<Exercice4.Tire>(tires);
		sorted.sort((t1, t2) -> t1.size - t2.size);

		return List.copyOf(sorted);
	}

	public static final class Tire {

		private final int size;

		public Tire(int size) {

			this.size = size;
		}

		@Override
		public String toString() {

			return String.valueOf(size);
		}
	}

}
