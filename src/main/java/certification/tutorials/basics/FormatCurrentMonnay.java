package certification.tutorials.basics;

import java.text.NumberFormat;
import java.text.NumberFormat.Style;
import java.util.Locale;

/**
 * 
 * code compiles and runs without issue. When a CompactNumberFormat instance is
 * requested without a style, it uses the SHORT style by default. This results
 * in both of the first two statements printing 100K.
 * If the LONG style were used, then 100 thousand would be printed. 
 *  as the full value is printed with a currency formatter.
 */
public class FormatCurrentMonnay {
	public void print(double t) {
		System.out.print(NumberFormat.getCompactNumberInstance().format(t));

		System.out.print(NumberFormat.getCompactNumberInstance(Locale.getDefault(), Style.SHORT).format(t));

		System.out.print(NumberFormat.getCurrencyInstance().format(t));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
