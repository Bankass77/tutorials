package certification.tutorials.basics;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * The second for-each loop contains a continue followed by a print() statement.
 * Because the continue is not conditional and always included as part of the
 * body of the for-each loop, the print() statement is not reachable. For this
 * reason, the print() statement does not compile. As this is the only
 * compilation error
 *
 */
public class BreakContinueTest {
	public static void main(String[] args) {
		List<Integer> myFavoriteNumbers = new ArrayList<>();
		myFavoriteNumbers.add(10);
		myFavoriteNumbers.add(14);
		for (var a : myFavoriteNumbers) {
			System.out.print(a + ", ");
			break;
		}

		for (int b : myFavoriteNumbers) {
			continue;
			System.out.print(b + ", ");
		}

		for (Object c : myFavoriteNumbers)
			System.out.print(c + ", ");

	}

}
