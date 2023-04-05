package certification.tutorials.checkTest;

/**
 * 
 * Prior to the first iteration, sing = 8, squawk = 2, and notes = 0. After the
 * iteration of the first loop, sing is updated to 7, squawk to 4, and notes to
 * the sum of the new values for sing + squawk, 7 + 4 = 11. After the iteration
 * of the second loop, sing is updated to 6, squawk to 6, and notes to the sum
 * of itself plus the new values for sing + squawk, 11 + 6 + 6 = 23. On the
 * third iteration of the loop, sing ˃ squawk evaluates to false, as 6 ˃ 6 is
 * false. The loop ends and the most recent value of sing, 23, is output
 *
 */
public class LoopForTest {

	public static void main(String[] args) {
		int sing = 8, squawk = 2, notes = 0;
		while (sing > squawk) {
			sing--;
			squawk += 2;
			notes += sing + squawk;

		}
		System.out.println(notes);
	}

}
