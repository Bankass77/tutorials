package certification.tutorials.collection;

import java.util.List;
import java.util.Queue;

/**
 * 
 * The addFirst() and addLast() methods are on the Deque interface. While
 * ArrayDeque does implement this interface, it also implements Queue. Since the
 * q variable is of type Queue, these methods do not compile
 *
 */
public class ArrayDequeTest {
	public static void main(String[] args) {
		Queue<String> q = new java.util.ArrayDeque<>();
		q.add("snowball");
		//q.addLast("sugar");
		//q.addFirst("minnie");

		System.out.println(q.peek() + " " + q.peek() + " " + q.size());
	

	}

}
