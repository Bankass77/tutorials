package certification.tutorials.exceptions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.CopyOnWriteArrayList;

public class DemoException2 {

	public static void main(String[] args) {
		var original = List.of(1, 2, 3, 4, 5);

		var copy1 = new CopyOnWriteArrayList<Integer>(original);
		for (Integer w : copy1)
			copy1.remove(w);

		var copy2 = Collections.synchronizedList(original);
		for (Integer w : copy2)
			copy2.remove(w);

		var copy3 = new ArrayList<Integer>(original);
		for (Integer w : copy3)
			copy3.remove(w);

		var copy4 = new ConcurrentLinkedQueue<Integer>(original);
		for (Integer w : copy4)
			copy4.remove(w);
	}

}
