package certification.tutorials.collection;

import java.util.List;

/**
 * 
 * Since it’s not a primitive stream, the underlying type is Stream˂Integer˃,
 * which means the data type of x is Integer. On the other hand, the data type
 * of w, y, and z is Float. Because Integer and Float both define a floatValue()
 * method, all of the lines compile. The code snippet prints 9.0 at runtime
 *
 */
public class ListTest {

	public static void main(String[] args) {
		var p = List.of(1, 3, 5);
		var q2 = p.parallelStream().reduce(0f, (w, x) -> w.floatValue() + x.floatValue(),
				(y, z) -> y.floatValue() + z.floatValue());
		System.out.println(q2);

	}

}
