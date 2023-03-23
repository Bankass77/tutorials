package certification.tutorials.collection;

import java.util.Arrays;
import java.util.List;

import javax.swing.event.InternalFrameListener;

public class ListExempleWithfactoryMetods {

	public static void main(String[] args) {

		System.out.println("--------Case Arrays.asList------------------");
		List<String> list = Arrays.asList("George", "François", "Goergette");

		for (String string : list) {

			System.out.println("Each element in list:" + string);
		}

		System.out.println("List replace element at index 0 int list:" + list.set(0, "Mahamoudou"));

		System.out.println("List after replace element at index 0:" + list);

		// list.add("Franck");

		// System.out.println("List after add new object:" + list);

		// System.out.println("List delete object in list:" + list.remove(0));

		System.out.println("--------Case List.of------------------");

		String[] array = new String[] { "a", "b", "c", "d" };

		List<String> of = List.of(array);

		System.out.println("List of example" + of);

		System.out.println("--------Case List copyOf------------------");

		List<String> copy = List.copyOf(list);

		System.out.println("Case List copyOf" + copy);

		// copy.addAll(of);

		// System.out.println("Case List copyOf add new array"+ copy);

	}

}
