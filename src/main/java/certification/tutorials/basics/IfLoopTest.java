package certification.tutorials.basics;

/**
 * 
 * This code does not compile because it has two else statements as part of a
 * single if statement. Notice that the second if statement is not connected to
 * the last else statement.
 */
public class IfLoopTest {
	public static void main(String[] input) {
		var plan = 1;
		plan = plan++ + --plan;
		if (plan == 1) {
			System.out.print("Plan A");
		} else {
			if (plan == 2)
				System.out.print("Plan B");
		}
	 } else System.out.print("Plan C");
}
	}

}
