package certification.tutorials.collection;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListWithVar {

	public static void main(String[] args) {

		System.out.println("------------first case :mixes var and generics-----------");

		var strings = new ArrayList<String>();

		strings.add("a");

		for (String string : strings) {

			System.out.println(string);
		}

		System.out.println("------------second case :mixes var and generics-----------");

		var list = new ArrayList<>();

		System.out.println("list with diamond: " + list);

		list.add("a");

		for (String object : list) { // Does not compile

		}
	}

}
