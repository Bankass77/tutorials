package certification.tutorials.datetime.patternTest;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class PatternTest {
	
	public static void main(String[] args) {
		var x = LocalDate.of(2022, 3, 1);
		var y = LocalDateTime.of(2022, 3, 1, 5, 55);
		var f = DateTimeFormatter.ofPattern("MMMM' at 'h' o'clock'");
		System.out.println(f.format(y));
		
		
	
	}

}
