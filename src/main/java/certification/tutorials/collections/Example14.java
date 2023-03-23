package certification.tutorials.collections;

import java.util.ArrayList;
import java.util.List;

public class Example14 {

	public static void main(String[] args) {

		List<String> list = new ArrayList<String>();
		list.add("No");
		list.add("matter");
		list.add("what");
		list.add("you");
		list.add("do");
		System.out.println(list);

		List<String> list1 = list.subList(2, 4);

		System.out.println(list);
		System.out.println("----------------List1----------------");
		System.out.println(list1);

		list.subList(2, 4).clear();
		System.out.println(list);

	}

}
