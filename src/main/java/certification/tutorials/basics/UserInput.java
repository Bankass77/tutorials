package certification.tutorials.basics;

import java.util.Scanner;

public class UserInput {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int month;

		do {
			System.out.println("Enter a month [1-12]:");
			month = scanner.nextInt();
		} while (month < 1 || month > 12);
		System.out.println("You entered " + " " + month);
	}

}
