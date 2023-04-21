package certification.tutorials.string;

import java.util.Scanner;

public class PrintEvenOddChars {

	private static void printEvenOddChars(String s) {
        StringBuilder evenChars = new StringBuilder();
        StringBuilder oddChars = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            if (i % 2 == 0) {
                evenChars.append(s.charAt(i));
            } else {
                oddChars.append(s.charAt(i));
            }
        }

        System.out.println(evenChars.toString() + " " + oddChars.toString());
    }

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        scanner.nextLine(); //

        for (int i = 0; i < t; i++) {
            String s = scanner.nextLine();
            printEvenOddChars(s);
        }

        scanner.close();
	}

}
