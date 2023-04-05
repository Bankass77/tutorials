package certification.tutorials.string;

/**
 * 
 * Since Java is pass-by-value, assigning a new object to a does not change the
 * caller. Calling append() does affect the caller because both the method
 * parameter and the caller have a reference to the same object. Finally,
 * returning a value does pass the reference to the caller for assignment to s3
 *
 */
public class StringBuilders {
	public static StringBuilder work(StringBuilder a, StringBuilder b) {
		a = new StringBuilder("a");
		b.append("b");
		return a;
	}

	public static void main(String[] args) {
		var s1 = new StringBuilder("s1");
		var s2 = new StringBuilder("s2");
		var s3 = work(s1, s2);
		System.out.println("s1 = " + s1);
		System.out.println("s2 = " + s2);
		System.out.println("s3 = " + s3);
		var date = LocalDate.of(2022, 4, 3);
		date.plusDays(2);
		date.plusHours(3);
		System.out.println(date.getYear() + " " + date.getMonth()
		    + " " + date.getDayOfMonth());
	}

}
