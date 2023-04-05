package certification.tutorials.concurrency;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ConcurrentSkipListSet;
import java.util.concurrent.CopyOnWriteArrayList;

/**
 * 
 * he code compiles without issue, so option D is incorrect. The
 * CopyOnWriteArrrayList class is designed to preserve the original list on
 * iteration, so the first loop will be executed exactly three times and, in the
 * process, will increase the size of tigers to six elements. The
 * ConcurrentSkipListSet class allows modifications, and since it enforces the
 * uniqueness of its elements, the value 5 is added only once, leading to a
 * total of four elements in bears. Finally, despite using the elements of lions
 * to populate the collections, tigers and bears are not backed by the original
 * list, so the size of lions is 3 throughout this program. For these reasons,
 * the program prints 3 6 4,
 *
 */
public class ConcurrentSkipListSetTest {

	public static void main(String[] args) {
		List<Integer> lions = new ArrayList<>(List.of(1, 2, 3));
		List<Integer> tigers = new CopyOnWriteArrayList<>(lions);
		Set<Integer> bears = new ConcurrentSkipListSet<>();
		bears.addAll(lions);
		for (Integer item : tigers)
			tigers.add(4); // x1
		for (Integer item : bears)
			bears.add(5); // x2
		System.out.println(lions.size() + " " + tigers.size() + " " + bears.size());
	}

}
