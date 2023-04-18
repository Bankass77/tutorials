package certification.tutorials.collection;

import java.util.ArrayList;
import java.util.List;

public class Lists {

	public static <T> List<T> toList(T[] arr) {
		List<T> list = new ArrayList<T>();
		for (T t : arr) {
			list.add(t);
			return list;

		}
		return null;

	}

}
