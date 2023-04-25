package certification.tutorials.basics;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class CurrencyFormatter {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		double payment = scanner.nextDouble();
		scanner.close();

		// US currency format
		NumberFormat usFormat = NumberFormat.getCurrencyInstance(Locale.US);
		String usCurrency = usFormat.format(payment);

		// Indian currency format
		NumberFormat indiaFormat = NumberFormat.getCurrencyInstance(new Locale("en", "IN"));
		String indiaCurrency = indiaFormat.format(payment);

		// Chinese currency format
		NumberFormat chinaFormat = NumberFormat.getCurrencyInstance(Locale.CHINA);
		String chinaCurrency = chinaFormat.format(payment);

		// French currency format
		NumberFormat franceFormat = NumberFormat.getCurrencyInstance(Locale.FRANCE);
		String franceCurrency = franceFormat.format(payment);

		// Print the formatted values
		System.out.println("US: " + usCurrency);
		System.out.println("India: " + indiaCurrency);
		System.out.println("China: " + chinaCurrency);
		System.out.println("France: " + franceCurrency);
	}
}