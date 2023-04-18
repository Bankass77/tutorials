package certification.tutorials;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LoopForTest {

	public class Solution {
		public static void main(String[] args) throws IOException {
			BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

			int N = Integer.parseInt(bufferedReader.readLine().trim());

			for (int i = 1; i <= 10; i++) {
				int result = N * i;
				System.out.println(String.format("%d x %d = %d", N, i, result));
			}
			bufferedReader.close();
		}
	}

}
