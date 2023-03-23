package certification.tutorials.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Example16 {

	public static void main(String[] args) {

		List array = new ArrayList();
		array.add(5);
		array.add(2);
		array.add(37);

		Iterator iterator = array.iterator();
		while (iterator.hasNext()) {
			int i = (int) iterator.next();
			System.out.println(i + " ");
		}

	}

}
