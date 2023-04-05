package certification.tutorials.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * 
 * The key to this question is keeping track of the types. Line 24 is a
 * Map<Integer, Integer>. Line 25 builds a List out of a Set of Entry objects,
 * giving us List<Entry<Integer, Integer>>. This causes a compile error on line
 * 31 since we can't multiply an Entry object by two.
 * 
 * Lines 26–29 are all of type List<Integer>. The first three are immutable, and
 * the one on line 24 is mutable. This means line 32 throws an
 * UnsupportedOperationException since we attempt to modify the list. Line 33
 * would work if we could get to it. Since there is one compiler error and one
 * runtime error
 *
 */
public class TestCopyOf {

	public static void main(String[] args) {
		var map = Map.of(1, 2, 3, 6);
		System.out.println("map:"+map);
		
		var list = List.copyOf(map.entrySet());
		System.out.println("list:"+list);
		
		List<Integer> one = List.of(8, 16, 2);
		var copy = List.copyOf(one);
		System.out.println("copy:"+copy);
		
		var copyOfCopy = List.copyOf(copy);
		System.out.println("copyOfCopy:"+copyOfCopy);
		
		var thirdCopy = new ArrayList<>(copyOfCopy);
		System.out.println("thirdCopy:"+thirdCopy);

		list.replaceAll(x -> x * 2);
		one.replaceAll(x -> x * 2);
		thirdCopy.replaceAll(x -> x * 2);

		System.out.println(thirdCopy);

	}

}
