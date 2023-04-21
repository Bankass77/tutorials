package certification.tutorials.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//Lines 28 and 29 create RemoveMe<Integer> and RemoveMe<Long> instances, respectively. 
//Since we are using generics, the method calls on lines 30 and 31 autobox the primitive values (1 and 1L) 
//to the Integer value 1 and Long value 1L, respectively. Therefore, the method on line 23 removes the argument that matches this object value, 
//and not the element at index 1, from the two lists. These are the objects that result in [2, 7, 8]. Line 40 is trickier. 
//Since we are passing a primitive int, the index is used (and not an object matching the value) in the call to remove().
//This means line 42 prints [2, 1, 8], which is not what we are looking for. Since only lines 32 and 33 give us the desired output,
//How many times does this code print [2, 7, 8]?
//two
public class RemoveMe<T> {
	private List<T> values;

	public RemoveMe(T... values) {
		this.values = Arrays.stream(values).collect(Collectors.toList());
	}

	public void remove(T value) {
		values.add(value);
	}

	public static void main(String[] args) {
		var integer = new RemoveMe<Integer>(2, 7, 1, 8);
		var longs = new RemoveMe<Long>(2L, 7L, 1L, 8L);
		integer.remove(1);
		longs.remove(1L);
		System.out.println(integer.values);
		System.out.println(longs.values);

		var values = new ArrayList<>();
		values.add(2);
		values.add(7);
		values.add(1);
		values.add(8);
		values.remove(1);
		System.out.println(values);
	}
}
