package certification.tutorials.string;

import java.util.List;

/**
 * 
 * The code compiles and runs without issue. The three-argument reduce() method
 * returns a generic type, while the one-argument reduce() method returns an
 * Optional. The concat1() method is passed an identity "a", which it applies to
 * each element, resulting in the reduction to aCataHat. The lambda expression
 * in the concat2() method reverses the order of its inputs, leading to a value
 * of HatCat
 *
 */
public class Concat {

	public String concat1(List<String> values) {
		return values.parallelStream().reduce("a", (x, y) -> x + y, String::concat);
	}

	public String concat2(List<String> values) {
		return values.parallelStream().reduce((w, z) -> z + w).get();
	}

	public static void main(String[] questions) {
		Concat c = new Concat();
		var list = List.of("Cat", "Hat");
		String x = c.concat1(list);
		String y = c.concat2(list);
		System.out.print(x + " " + y);
	}

}
