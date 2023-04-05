package certification.tutorials.basics;

/**
 * 
 * This example uses method chaining. After the call to append(), sb contains
 * "aaa". That result is passed to the first insert() call, which inserts at
 * index 1. At this point, sb contains abbaa. That result is passed to the final
 * insert(), which inserts at index 4, resulting in abbaccca
 *
 */
public class StringBuilderTest {

	public static void main(String[] args) {
		var sb = new StringBuilder();
		// sb.append("aaa").insert(1, "bb");
		// System.out.println(sb);
		System.out.println("------------------------------");
		sb.append("aaa").insert(1, "bb").insert(4, "ccc");
		System.out.println(sb);

	}

}
