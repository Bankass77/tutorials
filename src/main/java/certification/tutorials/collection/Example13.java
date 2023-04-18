package certification.tutorials.collection;

import java.util.ArrayList;
import java.util.List;

public class Example13 {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		list.add(35);
		list.add(19);
		list.add(11);
		list.add(11);
		list.add(83);
		list.add(7);
		System.out.println(list);
		int index = list.lastIndexOf(83);
		System.out.println("Before: find 83 at : " + index);
		list.remove(index - 1);
		System.out.println(list);
		index = list.lastIndexOf(83);
		System.out.println("After: find 83 at:" + index);

		// It'is possible to change the content of a node

		list.set(index - 1, 99);
		System.out.println(list);
		// If instead of deleting one node, you wanted to empty the whole list, the
		// command to the issue would be
		list.clear();
		System.out.println("List is empty: " + list);
	}

}
