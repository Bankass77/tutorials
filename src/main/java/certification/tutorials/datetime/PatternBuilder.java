package certification.tutorials.datetime;

import java.time.LocalDate;
import java.time.Year;

public class PatternBuilder {

	public static void main(String[] args) {
		
		// Use a builder pattern to build a date 2023-04-26
		LocalDate ld1= Year.of(2023).atMonth(4).atDay(22);
		System.out.println(ld1);
 
	}

}
