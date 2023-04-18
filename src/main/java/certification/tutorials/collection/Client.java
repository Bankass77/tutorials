package certification.tutorials.collection;

import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class Client {

	public static void main(String[] args) {
		Stack<Integer> stack = new Stack<Integer>();
		for (int i = 0; i < 4; i++) {

			stack.push(i);
			// assert stack.toString().equals("stack[0,1,2,3]");
			System.out.println(stack.toString().equals("stack[0,1,2,3]"));
		}

		List<Integer> ints = Arrays.asList(1, 2, 3);

		int s = 0;
		for (Integer integer : ints) {

			s += integer;
			assert s == 6;

			System.out.println("S=" + s);

		}

	}

}
