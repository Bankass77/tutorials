package certification.tutorials.generics;

import java.util.ArrayList;

/**
 * 
 * Line 20 does not compile. String::new is a constructor reference. This
 * constructor reference is equivalent to writing the lambda () -˃ new String().
 * It participates in deferred execution. When it is executed later, it will
 * return a String. It does not return a String on line 20, though. The method
 * reference is a Supplier˂String˃, which cannot be stored in list. Since the
 * code does not compile
 *
 */
public class ContructorReferenceNotInList {

	public static void main(String[] args) {
		var list = new ArrayList<>();
		list.add("Monday");
		list.add(String::new);
		list.add("Tuesday");
		list.remove(0);
		System.out.println(list.get(0));

	}

}
