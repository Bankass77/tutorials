package certification.tutorials.basics;

import java.text.NumberFormat;
import java.text.NumberFormat.Style;
import java.util.Locale;

/**
 * 
 * A CompactNumberFormat rounds to the nearest whole number within the
 * three-digit range, so the numeric value printed is 123. Since the SHORT style
 * is selected, the output is 123K
 *
 */
public class DoubleOutputTest {

	public void printReceipt(double t) {
		var formatter = NumberFormat.getCompactNumberInstance(Locale.getDefault(), Style.SHORT);
		System.out.print(formatter.format(t));
	}

	public static void main(String[] args) {

		DoubleOutputTest oupt = new DoubleOutputTest();
		oupt.printReceipt(123_456.789);

	}

}
