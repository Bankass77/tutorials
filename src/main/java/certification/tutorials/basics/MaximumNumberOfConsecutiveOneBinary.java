package certification.tutorials.basics;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MaximumNumberOfConsecutiveOneBinary {

	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(bufferedReader.readLine().trim());
		int count = 0;

		while (n != 0) {

			count++;

			n = n & (n >> 1);
		}
		System.out.println(count);
		bufferedReader.close();
	}

}
