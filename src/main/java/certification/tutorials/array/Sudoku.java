package certification.tutorials.array;

/**
 * 
 * Line 17 attempts to store a String in an array meant for an int. Line 17 does
 * not compile
 *
 */
public class Sudoku {

	static int[][] game;

	public static void main(String[] args) {
		game[3][3] = 6;

		Object[] obj = game;
		game[3][3] = "X";
		System.out.println(game[3][3]);
	}

}
