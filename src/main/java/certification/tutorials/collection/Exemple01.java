package certification.tutorials.collection;

import java.util.Arrays;

public class Exemple01 {

	public static void main(String[] args) {

		String[] text = new String[] { "spam", "more", "buy" };

		Arrays.sort(text);
		System.out.println(Arrays.toString(text));

		System.out.println("-----------------------");
		for (int i = 0; i < text.length; i++) {
			System.out.println(text[i] + " ");
		}

		System.out.println("-----------------------");

	}

}
