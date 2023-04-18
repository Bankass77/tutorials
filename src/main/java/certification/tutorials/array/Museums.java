package certification.tutorials.array;

import java.util.Arrays;
import java.util.List;

/**
 * 
 * When converting an array to a List, Java uses a fixed-length backed list.
 * This means that the list uses an array in the implementation. While changing
 * elements to new values is allowed, adding and removing elements is not
 *
 */
public class Museums {
	public static void main(String[] args) {
		String[] array = { "Natural History", "Science", "Art" };
		List<String> museums = Arrays.asList(array);
		museums.remove(2);
		System.out.println(museums);
	}

}
