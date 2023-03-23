package certification.tutorials.collections;

import java.util.LinkedHashSet;
import java.util.Set;

public class Example11 {

	public static void main(String[] args) {

		Set<Integer> set1 = new LinkedHashSet<Integer>();
		set1.add(35);
		set1.add(19);
		set1.add(11);
		set1.add(83);
		set1.add(7);

		Set<Integer> set2 = new LinkedHashSet<Integer>();
		set2.add(3);
		set2.add(19);
		set2.add(11);
		set2.add(0);
		set2.add(7);

		set1.removeAll(set2);

		System.out.println(set1);

		System.out.println(set1.containsAll(set2));

	}

}
