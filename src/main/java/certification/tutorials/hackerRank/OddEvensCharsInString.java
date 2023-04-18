package certification.tutorials.hackerRank;

import java.util.Scanner;

/**
 * 
 * Given a string, S, of length N that is indexed from 0 to N-1 , print its
 * even-indexed and odd-indexed characters as 2 space-separated strings on a
 * single line
 *
 */

public class OddEvensCharsInString {

	private static String printEvenIndexedAndOddIndexedCharacters(String word) {

		char[] myCharArray = word.toCharArray();

		String evenString = "";
		String oddString = "";

		if (word.length() > 2 && word.length() < 10000) {

			for (int i = 0; i < word.length(); i++) {

				if (i % 2 == 0) {

					oddString += myCharArray[i];
				} else {

					evenString += myCharArray[i];
				}
			}
		}

		return oddString + " " + evenString;
	}

	public static void main(String[] args) {
		System.out.println(" Write your text, please");
		Scanner scanner = new Scanner(System.in);

		String string = scanner.next();

		System.out.println(printEvenIndexedAndOddIndexedCharacters(string));
		scanner.close();
	}

}
