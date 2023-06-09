package certification.tutorials;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

public class TestCopyOnWriteArrayList {

	public static void main(String[] args) {
		var list1 = new ArrayList<>(List.of(1, 2, 3));
		System.out.println("list1:"+list1);
		var list2 = new CopyOnWriteArrayList<Integer>(list1);
		System.out.println("list2:"+list2);
		var map3 = new ConcurrentHashMap<Integer, Integer>();
		map3.put(1, 2);
		map3.put(3, 3);

		for (var item : list1)
			list1.add(10); // f1
		for (var item : list2)
			list2.add(item); // f2
		for (var key : map3.keySet())
			map3.remove(key); // f3
		System.out.println(list1.size() + " " + list2.size() + " " + map3.size());
	}

}
