package certification.tutorials.basics;

import java.util.Arrays;
import java.util.Scanner;

/**
 * num_queries = read_integer() # For each query for i in range(num_queries): #
 * Read the query parameters a, b, and n a = read_integer() b = read_integer() n
 * = read_integer() # Compute the series and print it series = [] sum = a for j
 * in range(n): sum += (2 ** j) * b series.append(sum) print(' '.join(str(x) for
 * x in series)) Explanation: We import the java.util.Scanner class to read
 * input from the console. We define a main method as the entry point of the
 * program. We create a Scanner object to read input from the console. We read
 * the number of queries from the input using the nextInt method. We loop over
 * the number of queries using a for loop and read the query parameters a, b,
 * and n using the nextInt method. We initialize an array series to store the
 * series of numbers. We initialize a variable sum to the value of a. We loop
 * over the integers j from 0 to n-1 and compute the j-th term of the series as
 * sum + Math.pow(2, j) * b. We store each term of the series in the array
 * series. We convert the series array to a string using the Arrays.toString
 * method and remove the brackets and commas using the replaceAll method with a
 * regular expression. We print the resulting string to the console using the
 * System.out.println method. We close the Scanner object to free up system
 * resources.
 *
 */
public class Series {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		// Read the number of queries
		int numQueries = input.nextInt();

		// For each query
		for (int i = 0; i < numQueries; i++) {
			// Read the query parameters a, b, and n
			int a = input.nextInt();
			int b = input.nextInt();
			int n = input.nextInt();

			// Compute the series and print it
			int[] series = new int[n];
			int sum = a;
			for (int j = 0; j < n; j++) {
				sum += Math.pow(2, j) * b;
				series[j] = sum;
			}
			System.out.println(Arrays.toString(series).replaceAll("[\\[\\],]", ""));
		}

		input.close();
	}
}
