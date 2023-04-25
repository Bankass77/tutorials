package certification.tutorials.collection;

import java.util.LinkedList;

/**
 * 
 * The code correctly creates a LinkedList with three elements. The stream
 * pipeline does compile. However, there is no terminal operation, which means
 * the stream is never evaluated, and the output is something like
 * java.util.stream.ReferencePipeline$2@404b9385. This is definitely not one of
 * the listed choices
 *
 */
public class LinkedListOffertMethodTest {

	public static void main(String[] args) {
		var dice = new LinkedList<Integer>();
		dice.offer(3);
		dice.offer(2);
		dice.offer(4);
		System.out.print(dice.stream().filter(n -> n != 4));

	}

}
