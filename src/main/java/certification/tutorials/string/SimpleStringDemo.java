package certification.tutorials.string;

public class SimpleStringDemo {

	public static void main(String[] args) {

		String text1 = null;

		String text21 = "two";

		String text22 = "two";

		String text23 = new String("two");

		String piece1 = "t";
		String piece21 = "wo";
		String text24 = piece1 + piece21;
		char c[] = { 't', 'w', 'o' };
		String text25 = new String(c);

		if (text22 == text23) {
			System.out.println("Equal References");

		} else {

			System.out.println("Different References");
		}

		if (text22.equals(text23)) {
			System.out.println("Equal objects");
		} else {
			System.out.println("Different objects");
		}

	}

}
