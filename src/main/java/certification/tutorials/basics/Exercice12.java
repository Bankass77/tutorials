package certification.tutorials.basics;

public class Exercice12 {

	public static void main(String[] args) {

		String[] letters = { "A", "B", "C" };

		for (String string : letters) {

			if (string.equals("A")) {

				continue; // Jumps to next iteration

			}

			System.out.println(string);
			if (string.equals("C")) {

				break; // Leave the for loop
			}

			System.out.println(string);
		}

	}

}
