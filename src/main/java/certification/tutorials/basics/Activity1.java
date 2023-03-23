package certification.tutorials.basics;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Activity1 {

	private static Pattern pattern = Pattern.compile("-?\\d+(\\.\\d+)?");

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first blood pressure");
		String bloodPressure = sc.nextLine();
		int systolic = Integer.valueOf(bloodPressure);
		System.out.println("Enter the second blood pressure");

		String bloodPressure2 = sc.nextLine();
		int diastolic = Integer.valueOf(bloodPressure2);
		sc.close();
		isNumeric(String.valueOf(bloodPressure));
		isNumeric(String.valueOf(bloodPressure2));

		if ((systolic <= 90) || (diastolic <= 60)) {
			System.out.println("low blood pressure");
		} else if ((systolic >= 120) || diastolic >= 80) {
			System.out.println("pre-high blood pressure");
		} else if ((systolic >= 140) || (diastolic >= 90)) {
			System.out.println("High blood pressure");
		} else {

			System.out.println("Normal blood pressure");
		}
	}

	public static boolean isNumeric(String strNum) {

		if (strNum == null) {

			System.err.print("The number is null");
			return false;
		} else if (strNum.isBlank()) {

			System.err.print("The number is blank");
		} else {
			return true;
		}

		return pattern.matcher(strNum).matches();
	}

}
