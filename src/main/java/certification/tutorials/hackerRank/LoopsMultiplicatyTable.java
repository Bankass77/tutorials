package certification.tutorials.hackerRank;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 
 * Objective In this challenge, we will use loops to do some math. Check out the
 * Tutorial tab to learn more. Task Given an integer, , print its first
 * multiples. Each multiple (where ) should be printed on a new line in the
 * form: n x i = result. Example n=3 The printout should look like this: 3 x 1 =
 * 3 3 x 2 = 6 3 x 3 = 9 3 x 4 = 12 3 x 5 = 15 3 x 6 = 18 3 x 7 = 21 3 x 8 = 24
 * 3 x 9 = 27 3 x 10 = 30
 */
public class LoopsMultiplicatyTable {
	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(bufferedReader.readLine().trim());

		for (int i = 1; i <= 10; i++) {
			int result = n * i;
			System.out.println(String.format("%d x %d = %d", n, i, result));
		}

		bufferedReader.close();
	}

}
