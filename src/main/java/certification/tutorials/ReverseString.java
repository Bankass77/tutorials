package certification.tutorials;

import java.util.Stack;

public class ReverseString {

	public String reverseOnlyLetterq(String s) {
		Stack<Character> Letters = new Stack<Character>();

		for (char character : s.toCharArray()) {

			if (Character.isLetter(character)) {
				Letters.push(character);
			}

		}

		StringBuilder ans = new StringBuilder();
		for (Character character : s.toCharArray()) {

			if (Character.isLetter(character)) {
				ans.append(Letters.pop());
			} else {

				ans.append(character);
			}

		}
		return Letters.toString();
	}

	public static void main(String[] args) {

	}
}
