package certification.tutorials.array;

/*
 * This code is correct. Line 10 correctly creates a 2D array. 
 * The next three lines correctly assign a value to an array element. Line 14 correctly outputs 3 in a row!,
 */
public class TicTacToe {

	public static void main(String[] args) {
		char[][] ticTacToe = new char[3][3];
		ticTacToe[0][0] = 'X';
		ticTacToe[1][1] = 'X';
		ticTacToe[2][2] = 'X';
		System.out.println(ticTacToe.length + " in a row!");

	}

}
