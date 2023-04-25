package certification.tutorials.string;

import java.text.NumberFormat;
import java.text.NumberFormat.Style;
import java.util.Locale;

/**
 * 
 * The code does not compile because the first formatter requires both a Locale
 * and a Style. You can omit both values, but not one
 *
 */
public class NumberFormatTest {

	public static void main(String[] args) {
		double p = 1_909.2;
		var nf1 = NumberFormat.getCompactNumberInstance(Locale.getDefault());
		var nf2 = NumberFormat.getCompactNumberInstance(Locale.getDefault(), Style.SHORT);
		var nf3 = NumberFormat.getCompactNumberInstance(Locale.getDefault(), Style.LONG);
		System.out.println(nf1.format(p));
		System.out.println(nf2.format(p));
		System.out.println(nf3.format(p));

	}

}
