package certification.tutorials.accessLevel;

import java.util.function.Predicate;

public class Panda {

	int age;

	public static void main(String[] args) {

		Panda p = new Panda();
		p.age = 1;
		check(p, p1 -> p1.age < 5);

	}

	private static void check(Panda panda, Predicate<Panda> pred) {
		String result = pred.test(panda) ? "match" : "not match";
		System.out.println(result);
	}
}
